package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.model.PlayOrigin;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class za8 implements fod0 {

    /* JADX INFO: renamed from: d */
    public static final List f281001d = h6f.m46715L("com.android.bluetooth", "com.google.android.bluetooth");

    /* JADX INFO: renamed from: e */
    public static final PlayOrigin f281002e;

    /* JADX INFO: renamed from: c */
    public final wnn f281003c;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("avrcp");
        th50 th50Var = uh50.f230369a;
        f281002e = builder.referrerIdentifier("avrcp").build();
    }

    public za8(wnn wnnVar) {
        this.f281003c = wnnVar;
    }

    @Override // p204p.fod0
    /* JADX INFO: renamed from: a */
    public final ExternalAccessoryDescription mo42270a(String str) {
        ykn yknVar = new ykn("avrcp");
        yknVar.m94057e1(str);
        yknVar.m94056d1("media_session");
        yknVar.m94059f1("bluetooth");
        return yknVar.m93999A();
    }

    @Override // p204p.fod0
    /* JADX INFO: renamed from: b */
    public final boolean mo42271b(String str) {
        return f281001d.contains(str);
    }

    @Override // p204p.fod0
    /* JADX INFO: renamed from: c */
    public final xnd0 mo42272c(uzx uzxVar, int i) {
        return this.f281003c.m88610b(uzxVar, f281002e, i);
    }
}
