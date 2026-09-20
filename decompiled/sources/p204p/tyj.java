package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes3.dex */
public enum tyj {
    NO_NETWORK(Alert.DURATION_SHOW_INDEFINITELY),
    SERVICE_ERROR(2147483646),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_WARNING(2147483645),
    /* JADX INFO: Fake field, exist only in values array */
    EMPTY_CONTENT(2147483644);


    /* JADX INFO: renamed from: d */
    public static final tyj[] f224982d = values();

    /* JADX INFO: renamed from: a */
    public final int f224984a;

    tyj(int i) {
        this.f224984a = i;
    }
}
