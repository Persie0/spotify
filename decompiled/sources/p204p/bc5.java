package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.car.app.model.Alert;
import com.comscore.util.log.LogLevel;
import com.spotify.encoreconsumermobile.elements.story.CircularVideoPreviewSpinner;
import com.spotify.mainlayout.p106ui.view.MainLayout;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.PlaybackQuality;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public class bc5 implements ceu, Init, Function, zhv, fum0, xc20, w5j0, iuk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25779a;

    public /* synthetic */ bc5(int i) {
        this.f25779a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final void m28673a(String str, ByteBuffer byteBuffer) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            byteBuffer.put((byte) str.charAt(i));
        }
        byteBuffer.put((byte) 0);
    }

    /* JADX INFO: renamed from: j */
    public static float m28674j(float f) {
        int i = CircularVideoPreviewSpinner.f3756f;
        return 1.0f - ((float) Math.pow(Math.abs(Math.sin((((double) f) * 3.141592653589793d) / ((double) 2.0f))), 2.0d));
    }

    /* JADX INFO: renamed from: m */
    public static wg61 m28675m(MainLayout mainLayout, int i) {
        return new wg61(new mx9(mainLayout, i, 3));
    }

    /* JADX INFO: renamed from: n */
    public static void m28676n(geu geuVar, StringBuilder sb) {
        int iCharAt = (sb.charAt(1) * '(') + (sb.charAt(0) * 1600) + sb.charAt(2) + 1;
        ((StringBuilder) geuVar.f79199f).append(new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)}));
        sb.delete(0, 3);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f25779a) {
            case 7:
                return who.f251413h.get(obj);
            case 9:
                pqm0 pqm0Var = (pqm0) obj;
                return new jor(((Number) pqm0Var.f180351b).longValue(), System.currentTimeMillis(), ((Boolean) pqm0Var.f180350a).booleanValue());
            case 24:
                return new rz21(SystemClock.elapsedRealtime());
            case 26:
                return gh31.m44710a((o2x0) obj);
            default:
                xul0 xul0VarPlaybackQuality = ((PlayerState) obj).playbackQuality();
                if (xul0VarPlaybackQuality.mo49279c()) {
                    BitrateLevel bitrateLevel = ((PlaybackQuality) xul0VarPlaybackQuality.mo49278b()).bitrateLevel();
                    switch (bitrateLevel == null ? -1 : sk51.f210022a[bitrateLevel.ordinal()]) {
                        case -1:
                        case 1:
                            break;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 2:
                            return lk51.f134261b;
                        case 3:
                            return lk51.f134262c;
                        case 4:
                            return lk51.f134263d;
                        case 5:
                            return lk51.f134264e;
                        case 6:
                            return lk51.f134265f;
                        case 7:
                            return lk51.f134266g;
                    }
                }
                return lk51.f134260a;
        }
    }

    @Override // p204p.xc20
    /* JADX INFO: renamed from: c */
    public boolean mo28677c() {
        boolean z;
        synchronized (svy.f214529a) {
            try {
                int i = svy.f214531c;
                svy.f214531c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > svy.f214532d + ((long) LogLevel.NONE)) {
                    svy.f214531c = 0;
                    svy.f214532d = SystemClock.uptimeMillis();
                    String[] list = svy.f214530b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    svy.f214533e = list.length < 800;
                }
                z = svy.f214533e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p204p.fum0
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        vf20 vf20Var = new vf20(parcel);
        vf20Var.f240879a = parcel.readFloat();
        vf20Var.f240880b = parcel.readInt() != 0;
        return vf20Var;
    }

    @Override // p204p.xc20
    /* JADX INFO: renamed from: e */
    public boolean mo28678e(ci21 ci21Var) {
        tjr tjrVar = ci21Var.f38194a;
        boolean z = tjrVar instanceof njr;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        if ((z ? ((njr) tjrVar).f154650a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        tjr tjrVar2 = ci21Var.f38195b;
        if (tjrVar2 instanceof njr) {
            i = ((njr) tjrVar2).f154650a;
        }
        return i > 100;
    }

    @Override // p204p.zhv
    /* JADX INFO: renamed from: f */
    public avt mo28679f(yhv yhvVar) {
        return mhf1.m61771p(yhvVar).m94133b(ccu.f36621Q0, ccu.f36622R0);
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((kaj) obj);
    }

    /* JADX INFO: renamed from: g */
    public int mo28680g(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        }
        if (c < '`' || c > 127) {
            sb.append("\u0001\u001e");
            return mo28680g((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    /* JADX INFO: renamed from: h */
    public int mo28681h() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0036 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #3 {, blocks: (B:11:0x0018, B:15:0x0022, B:23:0x0036, B:29:0x004b, B:21:0x0031, B:18:0x002d, B:26:0x0047), top: B:44:0x0018, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public cc5 m28682i() {
        cc5 cc5Var;
        cc5 cc5Var2 = null;
        if (p2l.f173365a.contains(cc5.class)) {
            cc5Var = null;
        } else {
            try {
                cc5Var = cc5.f36312c;
            } catch (Throwable th) {
                p2l.m68953a(cc5.class, th);
                cc5Var = null;
            }
        }
        if (cc5Var != null) {
            return cc5Var;
        }
        synchronized (this) {
            if (!p8y.f175096q.get()) {
                return null;
            }
            if (p2l.f173365a.contains(cc5.class)) {
                if (cc5Var2 == null) {
                    cc5Var2 = new cc5(0);
                    if (!p2l.f173365a.contains(cc5.class)) {
                        try {
                            cc5.f36312c = cc5Var2;
                        } catch (Throwable th2) {
                            p2l.m68953a(cc5.class, th2);
                        }
                    }
                }
                return cc5Var2;
            }
            try {
                cc5Var2 = cc5.f36312c;
            } catch (Throwable th3) {
                p2l.m68953a(cc5.class, th3);
            }
            if (cc5Var2 == null) {
                cc5Var2 = new cc5(0);
                if (!p2l.f173365a.contains(cc5.class)) {
                    cc5.f36312c = cc5Var2;
                }
            }
            return cc5Var2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo28683k(geu geuVar, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int length3 = ((StringBuilder) geuVar.f79199f).length() + length;
        geuVar.m44527e(length3);
        int i = ((mf61) geuVar.f79200g).f142970b - length3;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                m28676n(geuVar, sb);
            }
            if (geuVar.m44526d()) {
                geuVar.m44528f((char) 254);
            }
        } else if (i == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                m28676n(geuVar, sb);
            }
            if (geuVar.m44526d()) {
                geuVar.m44528f((char) 254);
            }
            geuVar.f79194a--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb.length() >= 3) {
                m28676n(geuVar, sb);
            }
            if (i > 0 || geuVar.m44526d()) {
                geuVar.m44528f((char) 254);
            }
        }
        geuVar.f79195b = 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public Object m28684l(i2c i2cVar, m011 m011Var, ibk ibkVar) {
        nn8 nn8Var;
        if (ibkVar instanceof nn8) {
            nn8Var = (nn8) ibkVar;
            int i = nn8Var.f156353c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nn8Var.f156353c = i - Integer.MIN_VALUE;
            } else {
                nn8Var = new nn8(this, ibkVar);
            }
        } else {
            nn8Var = new nn8(this, ibkVar);
        }
        Object obj = nn8Var.f156351a;
        int i2 = nn8Var.f156353c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return null;
        }
        bga.m29073P(obj);
        if (i2cVar instanceof a2c) {
            return new io8(((a2c) i2cVar).f11621a);
        }
        if (i2cVar instanceof z1c) {
            z1c z1cVar = (z1c) i2cVar;
            jr01 bcr0Var = new bcr0(z1cVar.f278277b, z1cVar.f278278c);
            nn8Var.f156353c = 1;
            Object objM60397a = m011Var.m60397a(bcr0Var, nn8Var);
            Object obj2 = yuk.f276404a;
            if (objM60397a == obj2) {
                return obj2;
            }
        } else if (i2cVar instanceof d2c) {
            Parcelable parcelable = ((d2c) i2cVar).f44534a;
            kc61 kc61Var = parcelable instanceof kc61 ? (kc61) parcelable : null;
            if (kc61Var != null) {
                return new jo8(kc61Var.f121393a);
            }
        }
        return null;
    }

    @Override // p204p.fum0
    public Object[] newArray(int i) {
        return new vf20[i];
    }

    @Override // p204p.ceu
    /* JADX INFO: renamed from: o */
    public void mo28685o(geu geuVar) {
        StringBuilder sb = new StringBuilder();
        while (geuVar.m44526d()) {
            char cM44525c = geuVar.m44525c();
            geuVar.f79194a++;
            int iMo28680g = mo28680g(cM44525c, sb);
            int length = ((StringBuilder) geuVar.f79199f).length() + ((sb.length() / 3) << 1);
            geuVar.m44527e(length);
            int i = ((mf61) geuVar.f79200g).f142970b - length;
            if (!geuVar.m44526d()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    int length2 = sb.length();
                    sb.delete(length2 - iMo28680g, length2);
                    geuVar.f79194a--;
                    iMo28680g = mo28680g(geuVar.m44525c(), sb2);
                    geuVar.f79200g = null;
                }
                while (sb.length() % 3 == 1 && ((iMo28680g <= 3 && i != 1) || iMo28680g > 3)) {
                    int length3 = sb.length();
                    sb.delete(length3 - iMo28680g, length3);
                    geuVar.f79194a--;
                    iMo28680g = mo28680g(geuVar.m44525c(), sb2);
                    geuVar.f79200g = null;
                }
                break;
            }
            if (sb.length() % 3 == 0) {
                if (k2h1.m55186s(geuVar.f79194a, mo28681h(), (String) geuVar.f79197d) != mo28681h()) {
                    geuVar.f79195b = 0;
                    break;
                }
            }
        }
        mo28683k(geuVar, sb);
    }

    public /* synthetic */ bc5(Object obj, int i) {
        this.f25779a = i;
    }

    public /* synthetic */ bc5(son sonVar, otn otnVar, int i) {
        this.f25779a = i;
    }

    public /* synthetic */ bc5(boolean z) {
        this.f25779a = 17;
    }

    @Override // p204p.w5j0
    /* JADX INFO: renamed from: d */
    public void mo24745d(String str) {
    }

    @Override // p204p.w5j0
    /* JADX INFO: renamed from: b */
    public void mo24744b(String str, d850 d850Var, Bundle bundle) {
    }
}
