package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class hb5 implements ixi {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f89393a;

    /* JADX INFO: renamed from: b */
    public final Object f89394b;

    public /* synthetic */ hb5(Object obj, int i) {
        this.f89393a = i;
        this.f89394b = obj;
    }

    @Override // p204p.ixi
    /* JADX INFO: renamed from: a */
    public final hxi mo34319a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = this.f89393a;
        Object obj = this.f89394b;
        switch (i) {
            case 0:
                int i2 = wkm0.f252262Q0;
                return new gb5(ujg1.m83280u(layoutInflater.inflate(R.layout.appiconpage_ui, viewGroup, false)), (C2098lp) obj);
            case 1:
                urm urmVar = (urm) ((q2n) obj).f184660a.f55002b;
                xg9 xg9Var = (xg9) urmVar.f233405d;
                kv91 kv91Var = (kv91) ((x070) urmVar.f233404c).f256824h.get();
                jg31.m53271i(kv91Var);
                np7 np7Var = new np7(6, kv91Var, new ipg0(0));
                x070 x070Var = (x070) urmVar.f233404c;
                ch9 ch9Var = (ch9) x070Var.f256820d.get();
                jg31.m53271i(ch9Var);
                jg31.m53271i((xre) x070Var.f256819c.get());
                z9j0 z9j0Var = (z9j0) x070Var.f256823g.get();
                jg31.m53271i(z9j0Var);
                m500 m500Var = (m500) x070Var.f256822f.get();
                jg31.m53271i(m500Var);
                return new c170(layoutInflater, bundle, xg9Var, np7Var, ch9Var, z9j0Var, m500Var);
            case 2:
                return new p4u0((q4u0) ((er70) obj).get());
            default:
                return new r341(((xjp) obj).m91238m(context, layoutInflater));
        }
    }
}
