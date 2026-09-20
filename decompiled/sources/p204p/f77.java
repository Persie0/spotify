package p204p;

import android.database.Cursor;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f77 implements k890, v8j, azx0, jb21 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f66571a;

    public /* synthetic */ f77(long j) {
        this.f66571a = j;
    }

    @Override // p204p.v8j
    public void accept(Object obj) {
        ((pdp0) obj).mo43883f(this.f66571a);
    }

    @Override // p204p.azx0
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        return new vo71(cursor.getLong(0), this.f66571a);
    }

    @Override // p204p.jb21
    public long get() {
        return this.f66571a;
    }

    @Override // p204p.k890
    public void invoke(Object obj) {
        l3d0 l3d0Var;
        wxo wxoVar = (wxo) obj;
        ayo ayoVar = wxoVar.f256082a;
        if (wxoVar.equals(ayoVar.f21315k) && (l3d0Var = ayoVar.f21319o) != null) {
            rad0 rad0Var = (rad0) l3d0Var.f129295b;
            rad0Var.f197283t2 = true;
            fw40 fw40Var = rad0Var.f197272i2;
            Handler handler = (Handler) fw40Var.f73934b;
            if (handler != null) {
                handler.post(new f57(fw40Var, this.f66571a, 0));
            }
        }
    }
}
