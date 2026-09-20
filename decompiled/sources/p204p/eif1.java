package p204p;

import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class eif1 implements d7x0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59884a = 2;

    /* JADX INFO: renamed from: b */
    public final Status f59885b;

    public eif1(Status status) {
        this.f59885b = status;
    }

    @Override // p204p.d7x0
    public final Status getStatus() {
        switch (this.f59884a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f59885b;
    }

    public eif1(d151 d151Var, Status status) {
        this.f59885b = status;
    }

    public eif1(ejf1 ejf1Var, Status status) {
        this.f59885b = status;
        Objects.requireNonNull(ejf1Var);
    }
}
