package p204p;

import android.graphics.Bitmap;
import androidx.car.app.model.Alert;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class nro implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157590a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hqb f157591b;

    public /* synthetic */ nro(hqb hqbVar, int i) {
        this.f157590a = i;
        this.f157591b = hqbVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f157590a) {
            case 0:
                u1p0 u1p0Var = (u1p0) obj;
                boolean z = u1p0Var instanceof t1p0;
                hqb hqbVar = this.f157591b;
                if (z) {
                    hqbVar.resumeWith(((t1p0) u1p0Var).f216307a);
                    return;
                } else {
                    if (!(u1p0Var instanceof s1p0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hqbVar.resumeWith(new d0w(null, Alert.DURATION_SHOW_INDEFINITELY));
                    return;
                }
            case 1:
                this.f157591b.resumeWith((r7f0) obj);
                return;
            case 2:
                this.f157591b.resumeWith(r7f0.f196565b);
                return;
            case 3:
                this.f157591b.resumeWith((Bitmap) obj);
                return;
            default:
                this.f157591b.resumeWith(new c6x0((Throwable) obj));
                return;
        }
    }
}
