package p204p;

import io.reactivex.rxjava3.core.Flowable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class mjy0 {

    /* JADX INFO: renamed from: a */
    public final dj70 f144425a;

    /* JADX INFO: renamed from: b */
    public final kv91 f144426b;

    /* JADX INFO: renamed from: c */
    public final aeh0 f144427c;

    /* JADX INFO: renamed from: d */
    public final Flowable f144428d;

    public mjy0(dj70 dj70Var, kv91 kv91Var, aeh0 aeh0Var, Flowable flowable) {
        this.f144425a = dj70Var;
        this.f144426b = kv91Var;
        this.f144427c = aeh0Var;
        this.f144428d = flowable;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071 A[PHI: r15
      0x0071: PHI (r15v8 java.lang.String) = (r15v5 java.lang.String), (r15v17 java.lang.String) binds: [B:19:0x0049, B:25:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m62049a(ibk ibkVar) {
        kjy0 kjy0Var;
        String str;
        String str2;
        String str3;
        if (ibkVar instanceof kjy0) {
            kjy0Var = (kjy0) ibkVar;
            int i = kjy0Var.f123449d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kjy0Var.f123449d = i - Integer.MIN_VALUE;
            } else {
                kjy0Var = new kjy0(this, ibkVar);
            }
        } else {
            kjy0Var = new kjy0(this, ibkVar);
        }
        Object obj = kjy0Var.f123447b;
        int i2 = kjy0Var.f123449d;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(obj);
            ocm0 ocm0VarMo32928a = this.f144425a.mo32928a(aey0.MAIN);
            str = ocm0VarMo32928a != null ? ocm0VarMo32928a.f163960b : null;
            if (wj50.m88271j(xoc1.f264152o1.f243453a, str)) {
                hvi0 hvi0Var = cks.f39079b;
                long jM54450E = jwg1.m54450E(300L, ils.MILLISECONDS);
                xay0 xay0Var = new xay0(this, str, fbkVar, 2);
                kjy0Var.f123446a = str;
                kjy0Var.f123449d = 1;
                Object objM76981v = s1h1.m76981v(jM54450E, xay0Var, kjy0Var);
                yuk yukVar = yuk.f276404a;
                if (objM76981v == yukVar) {
                    return yukVar;
                }
                str2 = str;
                obj = objM76981v;
            } else {
                str3 = str;
            }
            if (str3 != null) {
                return null;
            }
            aeh0 aeh0Var = this.f144427c;
            aeh0Var.getClass();
            yt91 yt91VarM96903c = aeh0Var.f14879a.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("shareable_entity", null, null, str3, null));
            yt91VarM96903c.f276056j = false;
            return this.f144426b.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("take_screenshot", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = kjy0Var.f123446a;
        bga.m29073P(obj);
        str = (String) obj;
        if (str == null) {
            str3 = str2;
        } else {
            str3 = str;
        }
        if (str3 != null) {
            return null;
        }
        aeh0 aeh0Var2 = this.f144427c;
        aeh0Var2.getClass();
        yt91 yt91VarM96903c2 = aeh0Var2.f14879a.m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("shareable_entity", null, null, str3, null));
        yt91VarM96903c2.f276056j = false;
        return this.f144426b.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("take_screenshot", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }
}
