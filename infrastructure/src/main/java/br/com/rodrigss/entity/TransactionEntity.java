package br.com.rodrigss.entity;
import br.com.rodrigss.core.domain.enums.TransactionStatusEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
/**
 * @author Rodrigo Estanislau
 */

@Entity
@Table(name = "Transactions")
public class TransactionEntity {

    @Column(name = "Id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fromWallet")
    private WalletEntity fromWallet;

    @ManyToOne
    @JoinColumn(name = "ToWallet")
    private WalletEntity toWallet;

    @Column(name = "TransactionValue", nullable = false)
    private BigDecimal value;

    @Column(name = "Status", nullable = false)
    @Enumerated(EnumType.STRING)
    private TransactionStatusEnum status;

    @Column(name = "CreatedAt", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "UpdatedAt")
    private LocalDateTime updatedAt;

}
