package p204p;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public enum oif1 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: c */
    public static final zgf1 f165810c;

    /* JADX INFO: renamed from: a */
    public final int f165812a;

    static {
        ob31 ob31Var = new ob31();
        ob31Var.f163529b = new Object[8];
        ob31Var.f163528a = 0;
        for (oif1 oif1Var : values()) {
            Integer numValueOf = Integer.valueOf(oif1Var.f165812a);
            int i = ob31Var.f163528a + 1;
            Object[] objArr = (Object[]) ob31Var.f163529b;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                if (i2 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i2) {
                        int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                        length = iHighestOneBit + iHighestOneBit;
                    }
                    if (length < 0) {
                        length = Alert.DURATION_SHOW_INDEFINITELY;
                    }
                }
                ob31Var.f163529b = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = (Object[]) ob31Var.f163529b;
            int i3 = ob31Var.f163528a;
            int i4 = i3 + i3;
            objArr2[i4] = numValueOf;
            objArr2[i4 + 1] = oif1Var;
            ob31Var.f163528a = i3 + 1;
        }
        ylf1 ylf1Var = (ylf1) ob31Var.f163530c;
        if (ylf1Var != null) {
            throw ylf1Var.m94161a();
        }
        zgf1 zgf1VarM96081d = zgf1.m96081d(ob31Var.f163528a, (Object[]) ob31Var.f163529b, ob31Var);
        ylf1 ylf1Var2 = (ylf1) ob31Var.f163530c;
        if (ylf1Var2 != null) {
            throw ylf1Var2.m94161a();
        }
        f165810c = zgf1VarM96081d;
    }

    oif1(int i) {
        this.f165812a = i;
    }
}
