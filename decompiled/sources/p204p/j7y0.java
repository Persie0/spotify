package p204p;

import com.spotify.musicplaybackspeed.speedcontrolbottomsheet.SpeedSaveError;
import com.spotify.musicplaybackspeed.speedcontrolbottomsheet.proto.SpeedPayload;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class j7y0 {

    /* JADX INFO: renamed from: c */
    public static final PlaylistRequestDecorationPolicy f109738c;

    /* JADX INFO: renamed from: a */
    public final wt80 f109739a;

    /* JADX INFO: renamed from: b */
    public final yz80 f109740b;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26432C();
        top0VarM18421v.m81213u((PlaylistItemDecorationPolicy) amp0VarM18396H.build());
        f109738c = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }

    public j7y0(wt80 wt80Var, yz80 yz80Var) {
        this.f109739a = wt80Var;
        this.f109740b = yz80Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m52666a(String str, String str2, ibk ibkVar) {
        h7y0 h7y0Var;
        if (ibkVar instanceof h7y0) {
            h7y0Var = (h7y0) ibkVar;
            int i = h7y0Var.f88567c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h7y0Var.f88567c = i - Integer.MIN_VALUE;
            } else {
                h7y0Var = new h7y0(this, ibkVar);
            }
        } else {
            h7y0Var = new h7y0(this, ibkVar);
        }
        h7y0 h7y0Var2 = h7y0Var;
        Object objM63325v = h7y0Var2.f88565a;
        int i2 = h7y0Var2.f88567c;
        if (i2 == 0) {
            bga.m29073P(objM63325v);
            h7y0Var2.f88567c = 1;
            objM63325v = ((n090) this.f109740b).m63325v(str, str2, "remove-item-speed", null, h7y0Var2);
            yuk yukVar = yuk.f276404a;
            if (objM63325v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM63325v);
        }
        p2x0 p2x0Var = (p2x0) objM63325v;
        if (p2x0Var instanceof m2x0) {
            return w2a1.f247311a;
        }
        if (p2x0Var instanceof k2x0) {
            return new c6x0(new SpeedSaveError(((k2x0) p2x0Var).f118699a.mo27977b()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0117, code lost:
    
        if (r0 == r13) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m52667b(String str, String str2, float f, ibk ibkVar) {
        i7y0 i7y0Var;
        String str3;
        float f2;
        String str4;
        String str5;
        float f3;
        String str6;
        String str7;
        p2x0 p2x0Var;
        if (ibkVar instanceof i7y0) {
            i7y0Var = (i7y0) ibkVar;
            int i = i7y0Var.f99650f;
            if ((i & Integer.MIN_VALUE) != 0) {
                i7y0Var.f99650f = i - Integer.MIN_VALUE;
            } else {
                i7y0Var = new i7y0(this, ibkVar);
            }
        } else {
            i7y0Var = new i7y0(this, ibkVar);
        }
        i7y0 i7y0Var2 = i7y0Var;
        Object objM76981v = i7y0Var2.f99648d;
        int i2 = i7y0Var2.f99650f;
        yz80 yz80Var = this.f109740b;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM76981v);
            i7y0Var2.f99645a = str;
            i7y0Var2.f99646b = str2;
            i7y0Var2.f99647c = f;
            i7y0Var2.f99650f = 1;
            Object objM63321r = ((n090) yz80Var).m63321r(str, "speed", true, false, i7y0Var2);
            if (objM63321r != yukVar) {
                str3 = str2;
                objM76981v = objM63321r;
                f2 = f;
                str4 = str;
            }
            return yukVar;
        }
        if (i2 == 1) {
            float f4 = i7y0Var2.f99647c;
            str3 = i7y0Var2.f99646b;
            String str8 = i7y0Var2.f99645a;
            bga.m29073P(objM76981v);
            f2 = f4;
            str4 = str8;
        } else if (i2 == 2) {
            f3 = i7y0Var2.f99647c;
            str3 = i7y0Var2.f99646b;
            String str9 = i7y0Var2.f99645a;
            bga.m29073P(objM76981v);
            str5 = str9;
            str6 = 0;
            str7 = str3;
            p2x0Var = (p2x0) objM76981v;
            if (p2x0Var == null) {
                return new c6x0(new SpeedSaveError("Timed out waiting for speed lens to be applied"));
            }
            if (p2x0Var instanceof k2x0) {
                return new c6x0(new SpeedSaveError(((k2x0) p2x0Var).f118699a.mo27977b()));
            }
            o541 o541VarM15771p = SpeedPayload.m15771p();
            o541VarM15771p.m66267m(new BigDecimal(String.valueOf(f3)).doubleValue());
            o541VarM15771p.m66268q();
            gva byteString = ((SpeedPayload) o541VarM15771p.build()).toByteString();
            i7y0Var2.f99645a = str6;
            i7y0Var2.f99646b = str6;
            i7y0Var2.f99647c = f3;
            i7y0Var2.f99650f = 3;
            objM76981v = ((n090) yz80Var).m63325v(str5, str7, "set-item-speed", byteString, i7y0Var2);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76981v);
        }
        p2x0 p2x0Var2 = (p2x0) objM76981v;
        if (p2x0Var2 instanceof m2x0) {
            return w2a1.f247311a;
        }
        if (p2x0Var2 instanceof k2x0) {
            return new c6x0(new SpeedSaveError(((k2x0) p2x0Var2).f118699a.mo27977b()));
        }
        throw new NoWhenBranchMatchedException();
        p2x0 p2x0Var3 = (p2x0) objM76981v;
        if (p2x0Var3 instanceof k2x0) {
            return new c6x0(new SpeedSaveError(((k2x0) p2x0Var3).f118699a.mo27977b()));
        }
        hvi0 hvi0Var = cks.f39079b;
        long jM54450E = jwg1.m54450E(5000L, ils.MILLISECONDS);
        fbk fbkVar = null;
        ilw0 ilw0Var = new ilw0(this, str4, str3, fbkVar, 16);
        i7y0Var2.f99645a = str4;
        i7y0Var2.f99646b = str3;
        i7y0Var2.f99647c = f2;
        i7y0Var2.f99650f = 2;
        objM76981v = s1h1.m76981v(jM54450E, ilw0Var, i7y0Var2);
        if (objM76981v != yukVar) {
            str5 = str4;
            f3 = f2;
            str6 = fbkVar;
            str7 = str3;
            p2x0Var = (p2x0) objM76981v;
            if (p2x0Var == null) {
                return new c6x0(new SpeedSaveError("Timed out waiting for speed lens to be applied"));
            }
            if (p2x0Var instanceof k2x0) {
                return new c6x0(new SpeedSaveError(((k2x0) p2x0Var).f118699a.mo27977b()));
            }
            o541 o541VarM15771p2 = SpeedPayload.m15771p();
            o541VarM15771p2.m66267m(new BigDecimal(String.valueOf(f3)).doubleValue());
            o541VarM15771p2.m66268q();
            gva byteString2 = ((SpeedPayload) o541VarM15771p2.build()).toByteString();
            i7y0Var2.f99645a = str6;
            i7y0Var2.f99646b = str6;
            i7y0Var2.f99647c = f3;
            i7y0Var2.f99650f = 3;
            objM76981v = ((n090) yz80Var).m63325v(str5, str7, "set-item-speed", byteString2, i7y0Var2);
        }
        return yukVar;
    }
}
