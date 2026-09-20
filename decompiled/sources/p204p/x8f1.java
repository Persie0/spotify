package p204p;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x8f1 implements d7x0 {

    /* JADX INFO: renamed from: a */
    public final Status f259143a;

    /* JADX INFO: renamed from: b */
    public final Map f259144b;

    public x8f1(Status status, HashMap map) {
        this.f259143a = status;
        this.f259144b = map;
    }

    @Override // p204p.d7x0
    public final Status getStatus() {
        return this.f259143a;
    }
}
