package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.model.PlayOrigin;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface fod0 {

    /* JADX INFO: renamed from: a */
    public static final PlayOrigin f71515a;

    /* JADX INFO: renamed from: b */
    public static final Set f71516b;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("media-session");
        th50 th50Var = uh50.f230369a;
        f71515a = builder.referrerIdentifier("app_integration").build();
        f71516b = s601.m77310m0(vnd0.f243068c, vnd0.f243067b, vnd0.f243066a, vnd0.f243073h, vnd0.f243074i, vnd0.f243070e, vnd0.f243069d, vnd0.f243075t, vnd0.f243072g, vnd0.f243061L0, vnd0.f243065Z);
    }

    /* JADX INFO: renamed from: a */
    ExternalAccessoryDescription mo42270a(String str);

    /* JADX INFO: renamed from: b */
    boolean mo42271b(String str);

    /* JADX INFO: renamed from: c */
    xnd0 mo42272c(uzx uzxVar, int i);
}
