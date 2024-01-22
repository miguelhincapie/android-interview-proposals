package solid.employee;

/**
 * This code merge Clean architecture and a modified version of Uncle Bob example used to explain
 * Single-responsibility principle.
 * <p>
 * The problems:
 * 1. Employee contains logic related to all layers:
 * 1.1. printInternalReport() belongs to UI.
 * 1.2. payEmployeeSalary() belongs to domain.
 * 1.3. save() and SerializedName() belong to data.
 * <p>
 * 2. The class behaves as DTO, Domain Model, Mapper, Use Case and repo.
 * <p>
 * What we are look for here is to know if the candidate knows about:
 * 1. Separation of concerns.
 * 2. Single-responsibility principle.
 * 3. Clean architecture pattern.
 *
 */