package p204p;

import com.spotify.kidssessions.p090v1.GetAutoLoginTokenRequest;
import com.spotify.kidssessions.p090v1.GetAutoLoginTokenResponse;
import com.spotify.kidssessions.p090v1.GetSessionResponse;
import com.spotify.kidssessions.p090v1.GetTransitioningProfileResponse;
import com.spotify.kidssessions.p090v1.ParentalConsentSession;
import com.spotify.kidssessions.p090v1.StartSessionRequest;
import com.spotify.kidssessions.p090v1.StartSessionResponse;
import com.spotify.kidssessions.p090v1.TerminateSessionRequest;
import com.spotify.kidssessions.p090v1.TerminateSessionResponse;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class z3e {

    /* JADX INFO: renamed from: a */
    public final a770 f278874a;

    /* JADX INFO: renamed from: b */
    public final dt81 f278875b;

    public z3e(a770 a770Var, dt81 dt81Var) {
        this.f278874a = a770Var;
        this.f278875b = dt81Var;
    }

    /* JADX INFO: renamed from: d */
    public static int m95269d(l301 l301Var) {
        int iOrdinal = l301Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return 2;
            }
            if (iOrdinal == 2) {
                return 3;
            }
            if (iOrdinal == 3) {
                return 4;
            }
            if (iOrdinal == 4) {
                return 5;
            }
            if (iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m95270a(String str, ibk ibkVar) {
        t3e t3eVar;
        if (ibkVar instanceof t3e) {
            t3eVar = (t3e) ibkVar;
            int i = t3eVar.f216754c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t3eVar.f216754c = i - Integer.MIN_VALUE;
            } else {
                t3eVar = new t3e(this, ibkVar);
            }
        } else {
            t3eVar = new t3e(this, ibkVar);
        }
        Object objM24921e = t3eVar.f216752a;
        int i2 = t3eVar.f216754c;
        if (i2 == 0) {
            bga.m29073P(objM24921e);
            v610 v610VarM12254q = GetAutoLoginTokenRequest.m12254q();
            v610VarM12254q.m84764q(this.f278875b.m36836b());
            v610VarM12254q.m84763m(str);
            GetAutoLoginTokenRequest getAutoLoginTokenRequest = (GetAutoLoginTokenRequest) v610VarM12254q.build();
            t3eVar.f216754c = 1;
            objM24921e = this.f278874a.m24921e(str, getAutoLoginTokenRequest, t3eVar);
            yuk yukVar = yuk.f276404a;
            if (objM24921e == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM24921e);
        }
        GetAutoLoginTokenResponse getAutoLoginTokenResponse = (GetAutoLoginTokenResponse) objM24921e;
        return new kv7(getAutoLoginTokenResponse.getUsername(), getAutoLoginTokenResponse.m12255n());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m95271b(String str, ibk ibkVar) {
        u3e u3eVar;
        if (ibkVar instanceof u3e) {
            u3eVar = (u3e) ibkVar;
            int i = u3eVar.f226334c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u3eVar.f226334c = i - Integer.MIN_VALUE;
            } else {
                u3eVar = new u3e(this, ibkVar);
            }
        } else {
            u3eVar = new u3e(this, ibkVar);
        }
        Object objM24918b = u3eVar.f226332a;
        int i2 = u3eVar.f226334c;
        if (i2 == 0) {
            bga.m29073P(objM24918b);
            u3eVar.f226334c = 1;
            objM24918b = this.f278874a.m24918b(str, u3eVar);
            yuk yukVar = yuk.f276404a;
            if (objM24918b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM24918b);
        }
        ParentalConsentSession parentalConsentSessionM12256n = ((GetSessionResponse) objM24918b).m12256n();
        return new vxm0(parentalConsentSessionM12256n.getSessionId(), parentalConsentSessionM12256n.getCreatedAt().m1969s(), parentalConsentSessionM12256n.m12261r().m1969s(), parentalConsentSessionM12256n.m12259p(), parentalConsentSessionM12256n.getChildId(), m95269d(parentalConsentSessionM12256n.m12260q()), parentalConsentSessionM12256n.m12258o());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m95272c(String str, ibk ibkVar) {
        v3e v3eVar;
        if (ibkVar instanceof v3e) {
            v3eVar = (v3e) ibkVar;
            int i = v3eVar.f236838c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v3eVar.f236838c = i - Integer.MIN_VALUE;
            } else {
                v3eVar = new v3e(this, ibkVar);
            }
        } else {
            v3eVar = new v3e(this, ibkVar);
        }
        Object objM24922f = v3eVar.f236836a;
        int i2 = v3eVar.f236838c;
        if (i2 == 0) {
            bga.m29073P(objM24922f);
            v3eVar.f236838c = 1;
            objM24922f = this.f278874a.m24922f(str, v3eVar);
            yuk yukVar = yuk.f276404a;
            if (objM24922f == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM24922f);
        }
        GetTransitioningProfileResponse getTransitioningProfileResponse = (GetTransitioningProfileResponse) objM24922f;
        String displayName = getTransitioningProfileResponse.getDisplayName();
        String username = getTransitioningProfileResponse.getUsername();
        String imageUrl = getTransitioningProfileResponse.getImageUrl();
        if (imageUrl.length() == 0) {
            imageUrl = null;
        }
        return new ub91(displayName, username, imageUrl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m95273e(ibk ibkVar) {
        w3e w3eVar;
        if (ibkVar instanceof w3e) {
            w3eVar = (w3e) ibkVar;
            int i = w3eVar.f247571c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w3eVar.f247571c = i - Integer.MIN_VALUE;
            } else {
                w3eVar = new w3e(this, ibkVar);
            }
        } else {
            w3eVar = new w3e(this, ibkVar);
        }
        Object objM24917a = w3eVar.f247569a;
        int i2 = w3eVar.f247571c;
        if (i2 == 0) {
            bga.m29073P(objM24917a);
            mr41 mr41VarM12265q = StartSessionRequest.m12265q();
            mr41VarM12265q.m62620q(this.f278875b.m36836b());
            mr41VarM12265q.m62619m(false);
            StartSessionRequest startSessionRequest = (StartSessionRequest) mr41VarM12265q.build();
            w3eVar.f247571c = 1;
            objM24917a = this.f278874a.m24917a(startSessionRequest, w3eVar);
            yuk yukVar = yuk.f276404a;
            if (objM24917a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM24917a);
        }
        ParentalConsentSession parentalConsentSessionM12266n = ((StartSessionResponse) objM24917a).m12266n();
        String sessionId = parentalConsentSessionM12266n.getSessionId();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new vxm0(sessionId, timeUnit.toMillis(parentalConsentSessionM12266n.getCreatedAt().m1969s()), timeUnit.toMillis(parentalConsentSessionM12266n.m12261r().m1969s()), parentalConsentSessionM12266n.m12259p(), parentalConsentSessionM12266n.getChildId(), m95269d(parentalConsentSessionM12266n.m12260q()), parentalConsentSessionM12266n.m12258o());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m95274f(ibk ibkVar) {
        x3e x3eVar;
        if (ibkVar instanceof x3e) {
            x3eVar = (x3e) ibkVar;
            int i = x3eVar.f257799c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x3eVar.f257799c = i - Integer.MIN_VALUE;
            } else {
                x3eVar = new x3e(this, ibkVar);
            }
        } else {
            x3eVar = new x3e(this, ibkVar);
        }
        Object objM24920d = x3eVar.f257797a;
        int i2 = x3eVar.f257799c;
        if (i2 == 0) {
            bga.m29073P(objM24920d);
            mr41 mr41VarM12265q = StartSessionRequest.m12265q();
            mr41VarM12265q.m62620q(this.f278875b.m36836b());
            mr41VarM12265q.m62619m(true);
            StartSessionRequest startSessionRequest = (StartSessionRequest) mr41VarM12265q.build();
            x3eVar.f257799c = 1;
            objM24920d = this.f278874a.m24920d(startSessionRequest, x3eVar);
            yuk yukVar = yuk.f276404a;
            if (objM24920d == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM24920d);
        }
        ParentalConsentSession parentalConsentSessionM12266n = ((StartSessionResponse) objM24920d).m12266n();
        String sessionId = parentalConsentSessionM12266n.getSessionId();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new vxm0(sessionId, timeUnit.toMillis(parentalConsentSessionM12266n.getCreatedAt().m1969s()), timeUnit.toMillis(parentalConsentSessionM12266n.m12261r().m1969s()), parentalConsentSessionM12266n.m12259p(), parentalConsentSessionM12266n.getChildId(), m95269d(parentalConsentSessionM12266n.m12260q()), parentalConsentSessionM12266n.m12258o());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m95275g(String str, ibk ibkVar) {
        y3e y3eVar;
        if (ibkVar instanceof y3e) {
            y3eVar = (y3e) ibkVar;
            int i = y3eVar.f268901c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y3eVar.f268901c = i - Integer.MIN_VALUE;
            } else {
                y3eVar = new y3e(this, ibkVar);
            }
        } else {
            y3eVar = new y3e(this, ibkVar);
        }
        Object objM24919c = y3eVar.f268899a;
        int i2 = y3eVar.f268901c;
        if (i2 == 0) {
            bga.m29073P(objM24919c);
            jz61 jz61VarM12269p = TerminateSessionRequest.m12269p();
            jz61VarM12269p.m54847m(str);
            TerminateSessionRequest terminateSessionRequest = (TerminateSessionRequest) jz61VarM12269p.build();
            y3eVar.f268901c = 1;
            objM24919c = this.f278874a.m24919c(str, terminateSessionRequest, y3eVar);
            yuk yukVar = yuk.f276404a;
            if (objM24919c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM24919c);
        }
        ParentalConsentSession parentalConsentSessionM12270n = ((TerminateSessionResponse) objM24919c).m12270n();
        return new vxm0(parentalConsentSessionM12270n.getSessionId(), parentalConsentSessionM12270n.getCreatedAt().m1969s(), parentalConsentSessionM12270n.m12261r().m1969s(), parentalConsentSessionM12270n.m12259p(), parentalConsentSessionM12270n.getChildId(), m95269d(parentalConsentSessionM12270n.m12260q()), parentalConsentSessionM12270n.m12258o());
    }
}
