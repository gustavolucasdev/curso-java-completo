# 📅 Operações com Datas em Java (`java.time`)

## Introdução

A API `java.time` (Java 8+) substitui `Date` e `Calendar`.

Principais classes:

Classe            Uso
  ----------------- --------------------------------------
`LocalDate`       Apenas data
`LocalTime`       Apenas hora
`LocalDateTime`   Data e hora
`Duration`        Diferença baseada em tempo
`Period`          Diferença baseada em dias/meses/anos
`ChronoUnit`      Unidade para cálculos
`Instant`         Timestamp UTC

------------------------------------------------------------------------

## `minusDays()` e `plusDays()`

``` java
LocalDate hoje = LocalDate.now();

LocalDate ontem = hoje.minusDays(1);
LocalDate amanha = hoje.plusDays(1);
```

Também existem:

``` java
.minusWeeks(1)
.minusMonths(1)
.minusYears(1)

.plusWeeks(2)
.plusMonths(3)
.plusYears(5)
```

------------------------------------------------------------------------

## `ChronoUnit`

Calcule diferenças:

``` java
long dias = ChronoUnit.DAYS.between(inicio, fim);
long meses = ChronoUnit.MONTHS.between(inicio, fim);
long anos = ChronoUnit.YEARS.between(inicio, fim);
```

Adicionar ou remover usando unidades:

``` java
LocalDate nova = hoje.plus(10, ChronoUnit.DAYS);
LocalDate antiga = hoje.minus(2, ChronoUnit.MONTHS);
```

Unidades comuns:

-   DAYS
-   WEEKS
-   MONTHS
-   YEARS
-   HOURS
-   MINUTES
-   SECONDS

------------------------------------------------------------------------

## `Duration`

Para intervalos de tempo (horas, minutos e segundos).

``` java
LocalDateTime inicio = LocalDateTime.now();

LocalDateTime fim = inicio.plusHours(5).plusMinutes(30);

Duration d = Duration.between(inicio, fim);

System.out.println(d.toHours());      // 5
System.out.println(d.toMinutes());    // 330
```

> Use `Duration` para tempo.
>
> Use `Period` para datas.

------------------------------------------------------------------------

## `Period`

``` java
LocalDate nascimento = LocalDate.of(2000,5,10);

Period idade = Period.between(nascimento, LocalDate.now());

System.out.println(idade.getYears());
```

------------------------------------------------------------------------

## `atStartOfDay()`

Converte uma data para meia-noite.

``` java
LocalDate hoje = LocalDate.now();

LocalDateTime inicio = hoje.atStartOfDay();
```

Resultado:

    2026-07-13T00:00

Muito usado em consultas ao banco.

------------------------------------------------------------------------

## Primeiro e último momento do dia

``` java
LocalDate data = LocalDate.now();

LocalDateTime inicio = data.atStartOfDay();

LocalDateTime fim = data.atTime(LocalTime.MAX);
```

------------------------------------------------------------------------

## Comparações

``` java
data1.isBefore(data2);
data1.isAfter(data2);
data1.isEqual(data2);
```

------------------------------------------------------------------------

## Conversões

``` java
LocalDateTime.now().toLocalDate();

LocalDate.now().atStartOfDay();
```

------------------------------------------------------------------------

## Formatação

``` java
DateTimeFormatter fmt =
        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

String texto = LocalDateTime.now().format(fmt);
```

------------------------------------------------------------------------

## Parse

``` java
LocalDate.parse("2026-07-13");

LocalDate.parse(
    "13/07/2026",
    DateTimeFormatter.ofPattern("dd/MM/yyyy")
);
```

------------------------------------------------------------------------

## Exemplos práticos

### Últimos 7 dias

``` java
LocalDate hoje = LocalDate.now();

LocalDate seteDias = hoje.minusDays(7);
```

### Dias entre duas datas

``` java
long dias = ChronoUnit.DAYS.between(inicio, fim);
```

### Tempo de execução

``` java
Instant inicio = Instant.now();

// código

Instant fim = Instant.now();

Duration tempo = Duration.between(inicio, fim);
```

### Consulta do dia inteiro

``` java
LocalDate hoje = LocalDate.now();

LocalDateTime inicio = hoje.atStartOfDay();
LocalDateTime fim = hoje.atTime(LocalTime.MAX);
```

------------------------------------------------------------------------

# Resumo

Objetivo             Classe/Método
  -------------------- -----------------------------------
Somar dias           `plusDays()`
Remover dias         `minusDays()`
Diferença em dias    `ChronoUnit.DAYS.between()`
Diferença em horas   `Duration.between()`
Diferença em anos    `Period.between()`
Início do dia        `atStartOfDay()`
Fim do dia           `atTime(LocalTime.MAX)`
Comparar datas       `isBefore()`, `isAfter()`
Formatar             `DateTimeFormatter`
Converter            `toLocalDate()`, `atStartOfDay()`
