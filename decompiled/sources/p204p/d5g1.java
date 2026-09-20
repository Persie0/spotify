package p204p;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d5g1 implements d7x0 {

    /* JADX INFO: renamed from: a */
    public final Status f45436a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f45437b;

    public d5g1(Status status, ArrayList arrayList) {
        this.f45436a = status;
        this.f45437b = arrayList;
    }

    @Override // p204p.d7x0
    public final Status getStatus() {
        return this.f45436a;
    }
}
