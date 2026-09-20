package p204p;

import com.spotify.messages.ConfigurationApplied;
import com.spotify.messages.ConfigurationAppliedNonAuth;
import com.spotify.messages.ConfigurationFetched;
import com.spotify.messages.ConfigurationFetchedNonAuth;
import com.spotify.messages.DefaultConfigurationApplied;

/* JADX INFO: loaded from: classes10.dex */
public final class n250 implements a6x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f149630a;

    /* JADX INFO: renamed from: b */
    public final b9a f149631b;

    /* JADX INFO: renamed from: c */
    public final pc5 f149632c;

    /* JADX INFO: renamed from: d */
    public final y6q0 f149633d;

    public /* synthetic */ n250(b9a b9aVar, pc5 pc5Var, y6q0 y6q0Var, int i) {
        this.f149630a = i;
        this.f149631b = b9aVar;
        this.f149632c = pc5Var;
        this.f149633d = y6q0Var;
    }

    @Override // p204p.a6x
    /* JADX INFO: renamed from: a */
    public final void mo24877a(zau0 zau0Var) {
        switch (this.f149630a) {
            case 0:
                String str = zau0Var.f281157d;
                boolean z = zau0Var.f281154a;
                b9a b9aVar = this.f149631b;
                pc5 pc5Var = this.f149632c;
                y6q0 y6q0Var = this.f149633d;
                if (!z) {
                    eii eiiVarM13772u = ConfigurationApplied.m13772u();
                    eiiVarM13772u.m39098q(y6q0Var.m92969b());
                    pc5Var.getClass();
                    eiiVarM13772u.m39102u();
                    eiiVarM13772u.m39103v();
                    eiiVarM13772u.m39101t();
                    eiiVarM13772u.m39097m(zau0Var.f281155b);
                    eiiVarM13772u.m39100s(zau0Var.f281156c);
                    eiiVarM13772u.m39099r(str);
                    b9aVar.m28464c("ConfigurationApplied", ((ConfigurationApplied) eiiVarM13772u.build()).toByteArray());
                } else {
                    n5p n5pVarM13833s = DefaultConfigurationApplied.m13833s();
                    n5pVarM13833s.m63745m(y6q0Var.m92969b());
                    pc5Var.getClass();
                    n5pVarM13833s.m63748s();
                    n5pVarM13833s.m63749t();
                    n5pVarM13833s.m63747r();
                    n5pVarM13833s.m63746q(str);
                    b9aVar.m28464c("DefaultConfigurationApplied", ((DefaultConfigurationApplied) n5pVarM13833s.build()).toByteArray());
                }
                break;
            default:
                if (!zau0Var.f281154a) {
                    gii giiVarM13780u = ConfigurationAppliedNonAuth.m13780u();
                    giiVarM13780u.m44805q(this.f149633d.m92969b());
                    this.f149632c.getClass();
                    giiVarM13780u.m44809u();
                    giiVarM13780u.m44810v();
                    giiVarM13780u.m44808t();
                    giiVarM13780u.m44804m(zau0Var.f281155b);
                    giiVarM13780u.m44807s(zau0Var.f281156c);
                    giiVarM13780u.m44806r(zau0Var.f281157d);
                    this.f149631b.m28464c("ConfigurationAppliedNonAuth", ((ConfigurationAppliedNonAuth) giiVarM13780u.build()).toByteArray());
                }
                break;
        }
    }

    @Override // p204p.a6x
    /* JADX INFO: renamed from: b */
    public final void mo24878b(String str, int i, long j, int i2, String str2, Long l, Integer num, String str3) {
        switch (this.f149630a) {
            case 0:
                long jLongValue = (l == null || l.longValue() == 0) ? -1L : l.longValue();
                lii liiVarM63540d = m63540d(j, str);
                liiVarM63540d.m59086q(str2);
                liiVarM63540d.m59077C(i2);
                liiVarM63540d.m59084J(i);
                liiVarM63540d.m59075A(jLongValue);
                if (num != null) {
                    liiVarM63540d.m59079E(num.intValue());
                }
                if (str3 != null) {
                    liiVarM63540d.m59083I(str3);
                }
                this.f149631b.m28464c("ConfigurationFetched", ((ConfigurationFetched) liiVarM63540d.build()).toByteArray());
                break;
            default:
                long jLongValue2 = (l == null || l.longValue() == 0) ? -1L : l.longValue();
                oii oiiVarM63541e = m63541e(j, str);
                oiiVarM63541e.m67040q(str2);
                oiiVarM63541e.m67032C(i2);
                oiiVarM63541e.m67038I(i);
                oiiVarM63541e.m67030A(jLongValue2);
                if (str3 != null) {
                    oiiVarM63541e.m67037H(str3);
                }
                this.f149631b.m28464c("ConfigurationFetchedNonAuth", ((ConfigurationFetchedNonAuth) oiiVarM63541e.build()).toByteArray());
                break;
        }
    }

    @Override // p204p.a6x
    /* JADX INFO: renamed from: c */
    public final void mo24879c(String str, long j, y5x y5xVar, int i) {
        switch (this.f149630a) {
            case 0:
                lii liiVarM63540d = m63540d(j, str);
                liiVarM63540d.m59084J(i);
                z5x z5xVar = y5xVar.f269560a;
                if (z5xVar != null) {
                    liiVarM63540d.m59092w(z5xVar.f279656a);
                }
                String str2 = y5xVar.f269561b;
                if (str2 != null) {
                    liiVarM63540d.m59089t(str2);
                }
                z5x z5xVar2 = y5xVar.f269562c;
                if (z5xVar2 != null) {
                    liiVarM63540d.m59094y(z5xVar2.f279656a);
                }
                Integer num = y5xVar.f269563d;
                if (num != null) {
                    liiVarM63540d.m59088s(num.intValue());
                }
                String str3 = y5xVar.f269564e;
                if (str3 != null) {
                    liiVarM63540d.m59091v(str3);
                }
                z5x z5xVar3 = y5xVar.f269565f;
                if (z5xVar3 != null) {
                    liiVarM63540d.m59093x(z5xVar3.f279656a);
                }
                Integer num2 = y5xVar.f269566g;
                if (num2 != null) {
                    liiVarM63540d.m59087r(num2.intValue());
                }
                String str4 = y5xVar.f269567h;
                if (str4 != null) {
                    liiVarM63540d.m59090u(str4);
                }
                this.f149631b.m28464c("ConfigurationFetched", ((ConfigurationFetched) liiVarM63540d.build()).toByteArray());
                break;
            default:
                oii oiiVarM63541e = m63541e(j, str);
                oiiVarM63541e.m67038I(i);
                z5x z5xVar4 = y5xVar.f269560a;
                if (z5xVar4 != null) {
                    oiiVarM63541e.m67046w(z5xVar4.f279656a);
                }
                String str5 = y5xVar.f269561b;
                if (str5 != null) {
                    oiiVarM63541e.m67043t(str5);
                }
                z5x z5xVar5 = y5xVar.f269562c;
                if (z5xVar5 != null) {
                    oiiVarM63541e.m67048y(z5xVar5.f279656a);
                }
                Integer num3 = y5xVar.f269563d;
                if (num3 != null) {
                    oiiVarM63541e.m67042s(num3.intValue());
                }
                String str6 = y5xVar.f269564e;
                if (str6 != null) {
                    oiiVarM63541e.m67045v(str6);
                }
                z5x z5xVar6 = y5xVar.f269565f;
                if (z5xVar6 != null) {
                    oiiVarM63541e.m67047x(z5xVar6.f279656a);
                }
                Integer num4 = y5xVar.f269566g;
                if (num4 != null) {
                    oiiVarM63541e.m67041r(num4.intValue());
                }
                String str7 = y5xVar.f269567h;
                if (str7 != null) {
                    oiiVarM63541e.m67044u(str7);
                }
                this.f149631b.m28464c("ConfigurationFetchedNonAuth", ((ConfigurationFetchedNonAuth) oiiVarM63541e.build()).toByteArray());
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public lii m63540d(long j, String str) {
        lii liiVarM13789I = ConfigurationFetched.m13789I();
        liiVarM13789I.m59095z(str);
        liiVarM13789I.m59085m(this.f149633d.m92969b());
        liiVarM13789I.m59076B(j);
        this.f149632c.getClass();
        liiVarM13789I.m59078D();
        liiVarM13789I.m59081G();
        liiVarM13789I.m59082H();
        liiVarM13789I.m59080F();
        liiVarM13789I.m59083I("N/A");
        return liiVarM13789I;
    }

    /* JADX INFO: renamed from: e */
    public oii m63541e(long j, String str) {
        oii oiiVarM13810H = ConfigurationFetchedNonAuth.m13810H();
        oiiVarM13810H.m67049z(str);
        oiiVarM13810H.m67039m(this.f149633d.m92969b());
        oiiVarM13810H.m67031B(j);
        this.f149632c.getClass();
        oiiVarM13810H.m67033D();
        oiiVarM13810H.m67035F();
        oiiVarM13810H.m67036G();
        oiiVarM13810H.m67034E();
        oiiVarM13810H.m67037H("N/A");
        return oiiVarM13810H;
    }
}
