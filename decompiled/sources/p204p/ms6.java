package p204p;

import com.spotify.mobius.android.AndroidLogger;

/* JADX INFO: loaded from: classes7.dex */
public final class ms6 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ns6 f146703a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms6(ns6 ns6Var) {
        super(1);
        this.f146703a = ns6Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        qsp qspVar = (qsp) ((hmh0) obj);
        qspVar.f192162a = gh6.f79838g;
        ns6 ns6Var = this.f146703a;
        qspVar.f192166e = new ls6(ns6Var, 0);
        qspVar.f192165d = new ls6(ns6Var, 1);
        qspVar.f192168g = new AndroidLogger();
        return w2a1.f247311a;
    }
}
