package io.secure.appengine;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RunWith(JUnit4.class)
public class StreamSample {
    @Test
    public void testTransactions() {
        List<Transaction> transactions = new ArrayList<>();

        Transaction transaction1 = new Transaction(1l);
        transaction1.setTransAmt(1000d);
        transactions.add(transaction1);

        Transaction transaction2 = new Transaction(2l);
        transaction2.setTransAmt(2000d);
        transactions.add(transaction2);

        Transaction transaction3 = new Transaction(3l);
        transaction3.setTransAmt(3000d);
        transactions.add(transaction3);

        Transaction transaction4 = new Transaction(4l);
        transaction4.setTransAmt(5000d);
        transactions.add(transaction4);

        Transaction transaction5 = new Transaction(5l);
        transaction5.setTransAmt(66000d);
        transactions.add(transaction5);

        Transaction transaction6 = new Transaction(6l);
        transaction6.setTransAmt(400d);
        transactions.add(transaction6);


        Map<Double,List<Transaction>> transactionListMap = transactions.stream()
                .filter((Transaction t) -> t.getTransAmt() > 500d)
                .collect(Collectors.groupingBy(Transaction::getTransAmt));

        System.out.println("StreamSample.testTransactions" + transactionListMap.keySet());
    }

    class Transaction {
        private Long transId;
        private Double transAmt;

        Transaction (Long transId) {
            this.transId = transId;
        }

        public Long getTransId() {
            return transId;
        }

        public void setTransId(Long transId) {
            this.transId = transId;
        }

        public Double getTransAmt() {
            return transAmt;
        }

        public void setTransAmt(Double transAmt) {
            this.transAmt = transAmt;
        }
    }
}
