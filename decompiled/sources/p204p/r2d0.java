package p204p;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
public final class r2d0 {

    /* JADX INFO: renamed from: a */
    public final Matcher f195127a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f195128b;

    /* JADX INFO: renamed from: c */
    public final q2d0 f195129c = new q2d0(this);

    /* JADX INFO: renamed from: d */
    public p2d0 f195130d;

    public r2d0(Matcher matcher, CharSequence charSequence) {
        this.f195127a = matcher;
        this.f195128b = charSequence;
    }

    /* JADX INFO: renamed from: a */
    public final List m74520a() {
        if (this.f195130d == null) {
            this.f195130d = new p2d0(this);
        }
        p2d0 p2d0Var = this.f195130d;
        wj50.m88279p(p2d0Var);
        return p2d0Var;
    }

    /* JADX INFO: renamed from: b */
    public final b450 m74521b() {
        Matcher matcher = this.f195127a;
        return n0e1.m63417Y(matcher.start(), matcher.end());
    }

    /* JADX INFO: renamed from: c */
    public final r2d0 m74522c() {
        Matcher matcher = this.f195127a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f195128b;
        if (iEnd <= charSequence.length()) {
            return vgg1.m85464e(matcher.pattern().matcher(charSequence), iEnd, charSequence);
        }
        return null;
    }
}
