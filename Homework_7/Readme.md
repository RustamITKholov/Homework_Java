В данном проекте соблюдены следующие принципы:

1. Принцип единственной ответственности (SRP): Классы BasicCalculator, Logger, и операции Addition, Multiplication, Division имеют одну ответственность каждый.

2. Принцип открытости/закрытости (OCP): Мы можем добавлять новые операции, не изменяя существующие классы.

3. Принцип подстановки Барбары Лисков (LSP): Подклассы операций могут быть использованы в любом месте, где ожидается базовый класс Operation.

4. Принцип разделения интерфейсов (ISP): Интерфейсы Calculator и Operation специализированы на своих задачах.

Также используется паттерн проектирования - Фабричный метод (Factory Method): Для создания объектов калькулятора.