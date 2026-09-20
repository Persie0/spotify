package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.recaptcha.internal.zzx;
import com.google.android.recaptcha.internal.zzy;
import com.google.android.recaptcha.internal.zzz;
import com.spotify.checkout.spotifycheckout.events.proto.AddressCollectionError;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonEncodingException;
import org.threeten.p203bp.DateTimeException;
import org.threeten.p203bp.zone.ZoneRulesException;

/* JADX INFO: loaded from: classes3.dex */
public final class t0h1 implements t6l0, Function, he40, hg50, ldr0, kdl0 {

    /* JADX INFO: renamed from: f */
    public static t0h1 f215885f;

    /* JADX INFO: renamed from: g */
    public static HandlerThread f215886g;

    /* JADX INFO: renamed from: h */
    public static Handler f215887h;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f215888a;

    /* JADX INFO: renamed from: b */
    public int f215889b;

    /* JADX INFO: renamed from: c */
    public Object f215890c;

    /* JADX INFO: renamed from: d */
    public Object f215891d;

    /* JADX INFO: renamed from: e */
    public Object f215892e;

    public /* synthetic */ t0h1(Object obj, int i, Serializable serializable, Serializable serializable2, int i2) {
        this.f215888a = i2;
        this.f215890c = obj;
        this.f215889b = i;
        this.f215891d = serializable;
        this.f215892e = serializable2;
    }

    /* JADX INFO: renamed from: F */
    public static /* bridge */ /* synthetic */ Context m79786F(t0h1 t0h1Var) {
        return (Context) t0h1Var.f215890c;
    }

    /* JADX INFO: renamed from: I */
    public static synchronized t0h1 m79787I(Context context) {
        try {
            if (f215885f == null) {
                f215885f = new t0h1(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new gvi0("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f215885f;
    }

    /* JADX INFO: renamed from: M */
    public static /* bridge */ /* synthetic */ ScheduledExecutorService m79788M(t0h1 t0h1Var) {
        return (ScheduledExecutorService) t0h1Var.f215891d;
    }

    /* JADX INFO: renamed from: P */
    public static final void m79789P(long j) throws zzy {
        long[] jArr = {1239547247, 271084552, 603409185, 805905448, 612732982, 1384275531, 148774773, 1155505365, 905894996};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        if (j % (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + jArr[6]) ^ (jArr[7] % 905894996)) != 0) {
            throw new zzy();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m79790A(jo70 jo70Var) {
        this.f215890c = jo70Var;
    }

    /* JADX INFO: renamed from: B */
    public void m79791B(float f, int i) {
        pqm0 pqm0Var;
        int i2 = this.f215889b;
        float[] fArr = (float[]) this.f215890c;
        Arrays.fill(fArr, 0, fArr.length, 1.0f);
        fArr[i] = f;
        if (i != fArr.length - 1) {
            fArr[i + 1] = 1 - f;
        }
        Float fValueOf = Float.valueOf(3.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (i2 <= 4) {
            pqm0Var = new pqm0(fValueOf2, Float.valueOf(i2 - 1));
        } else {
            int length = fArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                } else if (fArr[i3] < 1.0f) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 == -1) {
                pqm0Var = new pqm0(fValueOf2, fValueOf);
            } else {
                float f2 = fArr[i3];
                int i4 = i3 - 2;
                if (i4 < 0) {
                    pqm0Var = new pqm0(fValueOf2, fValueOf);
                } else {
                    float f3 = i4 + f2;
                    float f4 = i2 - 4;
                    if (f3 > f4) {
                        f3 = f4;
                    }
                    pqm0Var = new pqm0(Float.valueOf(f3), Float.valueOf((f3 + 4) - 1));
                }
            }
        }
        this.f215891d = pqm0Var;
        ldd1[] ldd1VarArr = new ldd1[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            ldd1VarArr[i5] = new ldd1(1.0f);
        }
        if (i2 >= 4) {
            int iCeil = (int) Math.ceil(((Number) ((pqm0) this.f215891d).f180350a).floatValue());
            int iFloor = (int) Math.floor(((Number) ((pqm0) this.f215891d).f180350a).floatValue());
            if (iCeil != iFloor) {
                float fFloatValue = ((Number) ((pqm0) this.f215891d).f180350a).floatValue() - iFloor;
                if (iFloor > 0) {
                    ldd1VarArr[iFloor] = new ldd1(fFloatValue);
                    ldd1VarArr[iCeil] = new ldd1(1 - fFloatValue);
                } else if (iCeil > 0) {
                    ldd1VarArr[iCeil] = new ldd1(1 - fFloatValue);
                }
            } else if (iCeil > 0) {
                ldd1VarArr[iCeil] = new ldd1(0.0f);
            }
            int iFloor2 = (int) Math.floor(((Number) ((pqm0) this.f215891d).f180351b).floatValue());
            int iCeil2 = (int) Math.ceil(((Number) ((pqm0) this.f215891d).f180351b).floatValue());
            if (iFloor2 != iCeil2) {
                float fFloatValue2 = iCeil2 - ((Number) ((pqm0) this.f215891d).f180351b).floatValue();
                int i6 = i2 - 1;
                if (iCeil2 < i6) {
                    ldd1VarArr[iCeil2] = new ldd1(fFloatValue2);
                    ldd1VarArr[iFloor2] = new ldd1(1 - fFloatValue2);
                } else if (iFloor2 < i6) {
                    ldd1VarArr[iFloor2] = new ldd1(1 - fFloatValue2);
                }
            } else if (iFloor2 < i2 - 1) {
                ldd1VarArr[iFloor2] = new ldd1(0.0f);
            }
        }
        this.f215892e = ldd1VarArr;
    }

    /* JADX INFO: renamed from: C */
    public void m79792C() {
        this.f215889b++;
    }

    /* JADX INFO: renamed from: D */
    public void m79793D(e6q0 e6q0Var) {
        if (this.f215889b == 2) {
            jo70 jo70Var = (jo70) this.f215890c;
            if (jo70Var == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            x5i0.m90021I(e6q0Var, jo70Var.mo30006K(0L), new p6q0((q6q0) this.f215892e, 1), true);
        }
        this.f215889b = 3;
    }

    /* JADX INFO: renamed from: E */
    public void m79794E(char[] cArr, int i) throws IOException {
        byte[] bArr = (byte[]) this.f215891d;
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        if (i > cArr.length) {
            StringBuilder sbM56838j = klh.m56838j(i, "count > string.length: ", " > ");
            sbM56838j.append(cArr.length);
            throw new IllegalArgumentException(sbM56838j.toString().toString());
        }
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            if (c < 128) {
                if (bArr.length - this.f215889b < 1) {
                    m79807g();
                }
                int i3 = this.f215889b;
                int i4 = i3 + 1;
                this.f215889b = i4;
                bArr[i3] = (byte) c;
                i2++;
                int iMin = Math.min(i, (bArr.length - i4) + i2);
                while (i2 < iMin) {
                    char c2 = cArr[i2];
                    if (c2 >= 128) {
                        break;
                    }
                    int i5 = this.f215889b;
                    this.f215889b = i5 + 1;
                    bArr[i5] = (byte) c2;
                    i2++;
                }
            } else {
                if (c < 2048) {
                    if (bArr.length - this.f215889b < 2) {
                        m79807g();
                    }
                    int i6 = this.f215889b;
                    int i7 = i6 + 1;
                    this.f215889b = i7;
                    bArr[i6] = (byte) ((c >> 6) | 192);
                    this.f215889b = i6 + 2;
                    bArr[i7] = (byte) ((c & '?') | 128);
                } else if (c < 55296 || c > 57343) {
                    if (bArr.length - this.f215889b < 3) {
                        m79807g();
                    }
                    int i8 = this.f215889b;
                    int i9 = i8 + 1;
                    this.f215889b = i9;
                    bArr[i8] = (byte) ((c >> '\f') | 224);
                    int i10 = i8 + 2;
                    this.f215889b = i10;
                    bArr[i9] = (byte) (((c >> 6) & 63) | 128);
                    this.f215889b = i8 + 3;
                    bArr[i10] = (byte) ((c & '?') | 128);
                } else {
                    int i11 = i2 + 1;
                    char c3 = i11 < i ? cArr[i11] : (char) 0;
                    if (c > 56319 || 56320 > c3 || c3 >= 57344) {
                        if (bArr.length - this.f215889b < 1) {
                            m79807g();
                        }
                        int i12 = this.f215889b;
                        this.f215889b = i12 + 1;
                        bArr[i12] = (byte) 63;
                        i2 = i11;
                    } else {
                        int i13 = (((c & 1023) << 10) | (c3 & 1023)) + 65536;
                        if (bArr.length - this.f215889b < 4) {
                            m79807g();
                        }
                        int i14 = this.f215889b;
                        int i15 = i14 + 1;
                        this.f215889b = i15;
                        bArr[i14] = (byte) ((i13 >> 18) | 240);
                        int i16 = i14 + 2;
                        this.f215889b = i16;
                        bArr[i15] = (byte) (((i13 >> 12) & 63) | 128);
                        int i17 = i14 + 3;
                        this.f215889b = i17;
                        bArr[i16] = (byte) (((i13 >> 6) & 63) | 128);
                        this.f215889b = i14 + 4;
                        bArr[i17] = (byte) ((i13 & 63) | 128);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public void m79795G(long j) {
        long[] jArr = {1540846267, 571107382, 1484708369, 709108262, 1568035521, 3652851584L, 192048860, 2037335344, 1874960596};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        m79789P(j);
        long j10 = j / (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + j8) ^ (j9 % 1874960596));
        if (j10 < 0 || j10 > ((h6h1) this.f215890c).f88099a.length) {
            throw new zzz();
        }
        this.f215889b = (int) j10;
    }

    /* JADX INFO: renamed from: H */
    public long m79796H() {
        long[] jArr = {1714636915, 1758565436, 174653550, 1653642768, 38095596, 2318926016L, 596516649, 1804289383, 846930886};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        return ((long) this.f215889b) * (((((((~j) & j2) | j3) + ((j & j4) | j5)) - j6) + jArr[6]) ^ (jArr[7] % 846930886));
    }

    /* JADX INFO: renamed from: J */
    public long m79797J() throws zzz {
        try {
            xeg1 xeg1Var = (xeg1) this.f215891d;
            h6h1 h6h1Var = (h6h1) this.f215890c;
            int i = this.f215889b;
            this.f215889b = i + 1;
            return xeg1Var.mo74897c(h6h1Var, i);
        } catch (IndexOutOfBoundsException e) {
            throw new zzz(e);
        }
    }

    /* JADX INFO: renamed from: K */
    public int m79798K() {
        try {
            xeg1 xeg1Var = (xeg1) this.f215891d;
            h6h1 h6h1Var = (h6h1) this.f215890c;
            int i = this.f215889b;
            this.f215889b = i + 1;
            int iMo74897c = xeg1Var.mo74897c(h6h1Var, i) & 255;
            xeg1 xeg1Var2 = (xeg1) this.f215891d;
            h6h1 h6h1Var2 = (h6h1) this.f215890c;
            int i2 = this.f215889b;
            this.f215889b = i2 + 1;
            int iMo74897c2 = iMo74897c | ((xeg1Var2.mo74897c(h6h1Var2, i2) & 255) << 8);
            xeg1 xeg1Var3 = (xeg1) this.f215891d;
            h6h1 h6h1Var3 = (h6h1) this.f215890c;
            int i3 = this.f215889b;
            this.f215889b = i3 + 1;
            int iMo74897c3 = iMo74897c2 | ((xeg1Var3.mo74897c(h6h1Var3, i3) & 255) << 16);
            xeg1 xeg1Var4 = (xeg1) this.f215891d;
            h6h1 h6h1Var4 = (h6h1) this.f215890c;
            int i4 = this.f215889b;
            this.f215889b = i4 + 1;
            return iMo74897c3 | (xeg1Var4.mo74897c(h6h1Var4, i4) << 24);
        } catch (IndexOutOfBoundsException e) {
            throw new zzz(e);
        }
    }

    /* JADX INFO: renamed from: L */
    public long m79799L() throws zzz, zzx {
        int i = 0;
        long j = 0;
        while (i < 64) {
            try {
                xeg1 xeg1Var = (xeg1) this.f215891d;
                h6h1 h6h1Var = (h6h1) this.f215890c;
                int i2 = this.f215889b;
                this.f215889b = i2 + 1;
                byte bMo74897c = xeg1Var.mo74897c(h6h1Var, i2);
                j |= ((long) (bMo74897c & 127)) << i;
                if (i == 63) {
                    if (bMo74897c > 1) {
                        throw new zzx();
                    }
                    i = 63;
                }
                if ((bMo74897c & 128) == 0) {
                    return (-(j & 1)) ^ (j >>> 1);
                }
                i += 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzz(e);
            }
        }
        throw new zzx();
    }

    /* JADX INFO: renamed from: N */
    public h6h1 m79800N(long j) throws zzz, zzy {
        int[] iArr = {2004270296, 933109376, 745751825, 330111618, 543277087, 1377683891, 125737768, 1632381616, 422449966};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iM79992g = t3d1.m79992g((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        m79789P(m79796H() + j);
        int i9 = this.f215889b;
        long j2 = i9;
        h6h1 h6h1Var = (h6h1) this.f215890c;
        long j3 = (j >> ((i8 % 422449966) ^ iM79992g)) + j2;
        if (j3 > h6h1Var.f88099a.length || j3 < j2) {
            throw new zzz();
        }
        try {
            int i10 = (int) j3;
            h6h1 h6h1VarMo74896a = ((xeg1) this.f215891d).mo74896a(h6h1Var, i9, i10);
            this.f215889b = i10;
            return h6h1VarMo74896a;
        } catch (IndexOutOfBoundsException e) {
            throw new AssertionError(u2h1.m82254a("CEiv6BFfPnitUE+D"), e);
        }
    }

    /* JADX INFO: renamed from: O */
    public synchronized y7h1 m79801O(mtg1 mtg1Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                new StringBuilder(String.valueOf(mtg1Var).length() + 9);
            }
            if (!((rng1) this.f215892e).m76004d(mtg1Var)) {
                rng1 rng1Var = new rng1(this);
                this.f215892e = rng1Var;
                rng1Var.m76004d(mtg1Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return mtg1Var.f147072b.f63172a;
    }

    @Override // p204p.ldr0
    /* JADX INFO: renamed from: a */
    public byte[] mo58758a(byte[] bArr, int i) throws InvalidAlgorithmParameterException {
        u1q u1qVar = (u1q) this.f215890c;
        if (i > this.f215889b) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) u1qVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) u1qVar.get()).doFinal(), i);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Object objInvoke;
        String string;
        switch (this.f215888a) {
            case 6:
                cu81 cu81Var = (cu81) obj;
                C2588xt c2588xt = new C2588xt((a9p) this.f215890c, (String) this.f215891d, (String) this.f215892e, this.f215889b);
                if (cu81Var instanceof au81) {
                    objInvoke = Single.just(qu1.f192540e);
                } else {
                    if (!(cu81Var instanceof bu81)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objInvoke = c2588xt.invoke(cu81Var);
                }
                return (SingleSource) objInvoke;
            case 9:
                a9p a9pVar = ((psp) this.f215890c).f180901a;
                String str = (String) this.f215891d;
                String str2 = (String) this.f215892e;
                return a9pVar.m25158a(this.f215889b, str, str2, (List) obj);
            case 14:
                pqm0 pqm0Var = (pqm0) obj;
                xul0 xul0Var = (xul0) pqm0Var.f180350a;
                return ((xv11) this.f215890c).mo44269a(this.f215889b, (xt80) xul0Var.mo49283h()).map(new hr81((String) this.f215891d, (String) this.f215892e, this.f215889b, xul0Var, (p8y0) pqm0Var.f180351b, 12));
            case 16:
                jyx jyxVar = (jyx) obj;
                TimeUnit timeUnit = iun0.f106001e;
                iun0 iun0Var = (iun0) this.f215890c;
                return Observable.combineLatest(Observable.interval(0L, 1L, timeUnit, iun0Var.f106004c), iun0Var.f106005d.m32730a(true), iun0Var.f106003b.m71323e().toObservable(), mly.f144957W0).switchMap(new hr81((ExternalAccessoryDescription) this.f215891d, this.f215889b, (roa) this.f215892e, iun0Var, jyxVar));
            default:
                int i = this.f215889b;
                he90 he90Var = (he90) this.f215890c;
                if (((Boolean) obj).booleanValue()) {
                    return Single.just(h231.f86879c);
                }
                View view = (View) this.f215891d;
                yqp yqpVar = (yqp) he90Var.f90382f;
                Context context = (Context) he90Var.f90378b;
                int iM38547C = edb.m38547C(i);
                if (iM38547C == 0) {
                    string = context.getString(R.string.smart_shuffle_playlist_onboarding_text);
                } else {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = context.getString(R.string.smart_shuffle_liked_songs_onboarding_text);
                }
                return yqpVar.m94393c(new osj0(new fd21(string, 2, 3, 10000L, 38), view, null, 12)).flatMap(new zk1(he90Var, (String) this.f215892e, i, 29));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m79802b(s9p0 s9p0Var) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f215892e;
        u9p0 u9p0Var = (u9p0) this.f215891d;
        if (u9p0Var != null) {
            s9p0 s9p0Var2 = (s9p0) u9p0Var.f228246c.get();
            if (s9p0Var2 == null) {
                throw new IllegalStateException("reference has been gc'd");
            }
            u9p0Var.f228248e = false;
            zv41 zv41Var = s9p0Var2.f206993b;
            Boolean bool = Boolean.FALSE;
            zv41Var.getClass();
            zv41Var.m97091m(null, bool);
            s9p0Var2.f206994c = null;
        }
        u9p0 u9p0Var2 = (u9p0) weakHashMap.get(s9p0Var);
        if (u9p0Var2 != null && u9p0Var2.f228246c.get() == null) {
            weakHashMap.remove(s9p0Var);
        }
        Object u9p0Var3 = weakHashMap.get(s9p0Var);
        if (u9p0Var3 == null) {
            u9p0Var3 = new u9p0(s9p0Var, (yrv) this.f215890c, this.f215889b);
            weakHashMap.put(s9p0Var, u9p0Var3);
        }
        u9p0 u9p0Var4 = (u9p0) u9p0Var3;
        this.f215891d = u9p0Var4;
        s9p0 s9p0Var3 = (s9p0) u9p0Var4.f228246c.get();
        if (s9p0Var3 == null) {
            throw new IllegalStateException("reference has been gc'd");
        }
        u9p0Var4.f228248e = true;
        s9p0Var3.f206994c = u9p0Var4;
        zv41 zv41Var2 = s9p0Var3.f206993b;
        Boolean bool2 = Boolean.TRUE;
        zv41Var2.getClass();
        zv41Var2.m97091m(null, bool2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: c */
    public void m79803c(e6q0 e6q0Var, boolean z) {
        q6q0 q6q0Var = (q6q0) this.f215892e;
        ?? r1 = e6q0Var.f56704a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            if (((k6q0) r1.get(i)).m55612l()) {
                m79793D(e6q0Var);
                return;
            }
        }
        jo70 jo70Var = (jo70) this.f215890c;
        if (jo70Var == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        x5i0.m90021I(e6q0Var, jo70Var.mo30006K(0L), new sqo0(26, this, q6q0Var), false);
        if (this.f215889b == 2) {
            if (z) {
                int size2 = r1.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((k6q0) r1.get(i2)).m55602a();
                }
            }
            C1668ai c1668ai = e6q0Var.f56705b;
            if (c1668ai != null) {
                c1668ai.f15839b = !q6q0Var.f185906c;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m79804d() {
        w591 w591Var = (w591) this.f215890c;
        qqi0 qqi0Var = (qqi0) this.f215892e;
        int i = this.f215889b - 1;
        this.f215889b = i;
        if (i == 0 && qqi0Var.f191610c != 0) {
            l971 l971Var = w591Var.f248034a;
            uw40 uw40Var = w591Var.f248035b;
            l971Var.f131023b.m80094c().m31891n();
            t571 t571Var = l971Var.f131023b;
            if (w591Var.f248037d == null && w591Var.f248036c == null) {
                this.f215891d = t571Var;
            }
            Object[] objArr = qqi0Var.f191608a;
            int i2 = qqi0Var.f191610c;
            for (int i3 = 0; i3 < i2; i3++) {
                ((gh00) objArr[i3]).invoke(t571Var);
            }
            w591Var.m87243q(t571Var);
            l971.m58497a(l971Var, uw40Var, false, 1);
            l971Var.m58502f(true);
            qqi0Var.m73561g();
        }
        return this.f215889b > 0;
    }

    /* JADX INFO: renamed from: e */
    public void m79805e() {
        this.f215889b--;
    }

    /* JADX INFO: renamed from: f */
    public void m79806f(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f215892e;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f215892e = Arrays.copyOf(cArr, i3);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m79807g() throws IOException {
        ((FileOutputStream) this.f215890c).write((byte[]) this.f215891d, 0, this.f215889b);
        this.f215889b = 0;
    }

    /* JADX INFO: renamed from: h */
    public s9p0 m79808h() {
        u9p0 u9p0Var = (u9p0) this.f215891d;
        if (u9p0Var != null) {
            return u9p0Var.f228244a;
        }
        return null;
    }

    @Override // p204p.hg50
    /* JADX INFO: renamed from: i */
    public void mo33242i(char c) throws IOException {
        byte[] bArr = (byte[]) this.f215891d;
        if (c < 128) {
            if (bArr.length - this.f215889b < 1) {
                m79807g();
            }
            int i = this.f215889b;
            this.f215889b = i + 1;
            bArr[i] = (byte) c;
            return;
        }
        if (c < 2048) {
            if (bArr.length - this.f215889b < 2) {
                m79807g();
            }
            int i2 = this.f215889b;
            int i3 = i2 + 1;
            this.f215889b = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.f215889b = i2 + 2;
            bArr[i3] = (byte) ((c & '?') | 128);
            return;
        }
        if (55296 <= c && c < 57344) {
            if (bArr.length - this.f215889b < 1) {
                m79807g();
            }
            int i4 = this.f215889b;
            this.f215889b = i4 + 1;
            bArr[i4] = (byte) 63;
            return;
        }
        if (c < 0) {
            if (bArr.length - this.f215889b < 3) {
                m79807g();
            }
            int i5 = this.f215889b;
            int i6 = i5 + 1;
            this.f215889b = i6;
            bArr[i5] = (byte) 224;
            int i7 = i5 + 2;
            this.f215889b = i7;
            bArr[i6] = (byte) (((c >> 6) & 63) | 128);
            this.f215889b = i5 + 3;
            bArr[i7] = (byte) ((c & '?') | 128);
            return;
        }
        if (c > 65535) {
            throw new JsonEncodingException(edb.m38563l("Unexpected code point: ", c, ". Check your strings for malformed UTF-8 sequences."), null, 6);
        }
        if (bArr.length - this.f215889b < 4) {
            m79807g();
        }
        int i8 = this.f215889b;
        int i9 = i8 + 1;
        this.f215889b = i9;
        bArr[i8] = (byte) 240;
        int i10 = i8 + 2;
        this.f215889b = i10;
        bArr[i9] = (byte) 128;
        int i11 = i8 + 3;
        this.f215889b = i11;
        bArr[i10] = (byte) (((c >> 6) & 63) | 128);
        this.f215889b = i8 + 4;
        bArr[i11] = (byte) ((c & '?') | 128);
    }

    @Override // p204p.he40
    /* JADX INFO: renamed from: j */
    public long mo47267j(long j) {
        w591 w591Var = (w591) this.f215890c;
        return (w591Var.f248037d == null && w591Var.f248036c == null) ? j : w591Var.m87238j(j);
    }

    /* JADX INFO: renamed from: k */
    public Locale m79809k() {
        return (Locale) this.f215891d;
    }

    @Override // p204p.he40
    /* JADX INFO: renamed from: l */
    public int mo47268l() {
        t571 t571Var = (t571) this.f215891d;
        return t571Var != null ? t571Var.f217234c.length() : ((w591) this.f215890c).m87235g().f226935c.length();
    }

    @Override // p204p.he40
    /* JADX INFO: renamed from: m */
    public long mo47269m(long j) {
        w591 w591Var = (w591) this.f215890c;
        return (w591Var.f248037d == null && w591Var.f248036c == null) ? j : w591Var.m87237i(j);
    }

    /* JADX INFO: renamed from: n */
    public int m79810n() {
        int i = this.f215889b;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    /* JADX INFO: renamed from: o */
    public zpo m79811o() {
        return (zpo) this.f215892e;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0037  */
    @Override // p204p.kdl0
    public void onSuccess(Object obj) {
        oyp0 oyp0Var;
        bfg1 bfg1Var = (bfg1) this.f215890c;
        String str = (String) this.f215891d;
        int i = this.f215889b;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f215892e;
        Bundle bundle = (Bundle) obj;
        s101 s101Var = bfg1Var.f26711a;
        ig31.m50506x(s101Var);
        tnf1 tnf1Var = bfg1Var.f26712b;
        if (i == 3) {
            oyp0Var = new oyp0(bfg1Var, bfg1Var.f26713c, str);
            s101Var.m76907a(new bmf1(oyp0Var));
            if (tnf1Var != null) {
                tng1 tng1Var = new tng1(oyp0Var, 1);
                tnf1.f221963g.m83848a("register callback = %s", tng1Var);
                ig31.m50501s("Must be called from the main thread.");
                tnf1Var.f221965b.add(tng1Var);
            }
        } else if (i == 2) {
            i = 2;
            oyp0Var = new oyp0(bfg1Var, bfg1Var.f26713c, str);
            s101Var.m76907a(new bmf1(oyp0Var));
            if (tnf1Var != null) {
                tng1 tng1Var2 = new tng1(oyp0Var, 1);
                tnf1.f221963g.m83848a("register callback = %s", tng1Var2);
                ig31.m50501s("Must be called from the main thread.");
                tnf1Var.f221965b.add(tng1Var2);
            }
        }
        if (i == 1 || i == 2) {
            fqg1 fqg1Var = new fqg1(sharedPreferences, bfg1Var, bfg1Var.f26713c, bundle, str);
            s101Var.m76907a(new b201(fqg1Var, 1));
            if (tnf1Var != null) {
                tng1 tng1Var3 = new tng1(fqg1Var, 0);
                tnf1.f221963g.m83848a("register callback = %s", tng1Var3);
                ig31.m50501s("Must be called from the main thread.");
                tnf1Var.f221965b.add(tng1Var3);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public bz61 m79812p() {
        return (bz61) this.f215890c;
    }

    /* JADX INFO: renamed from: q */
    public Long m79813q(dz61 dz61Var) {
        try {
            return Long.valueOf(((bz61) this.f215890c).mo26517g(dz61Var));
        } catch (DateTimeException e) {
            if (this.f215889b > 0) {
                return null;
            }
            throw e;
        }
    }

    @Override // p204p.hg50
    /* JADX INFO: renamed from: r */
    public void mo33248r(String str) throws IOException {
        byte b;
        m79806f(0, str.length() + 2);
        char[] cArr = (char[]) this.f215892e;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i = length + 1;
        int length2 = 1;
        while (length2 < i) {
            char c = cArr[length2];
            byte[] bArr = nl51.f155009b;
            if (c < bArr.length && bArr[c] != 0) {
                int length3 = str.length();
                for (int i2 = length2 - 1; i2 < length3; i2++) {
                    m79806f(length2, 2);
                    char cCharAt = str.charAt(i2);
                    byte[] bArr2 = nl51.f155009b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i3 = length2 + 1;
                        ((char[]) this.f215892e)[length2] = cCharAt;
                        length2 = i3;
                    } else if (b == 1) {
                        String str2 = nl51.f155008a[cCharAt];
                        wj50.m88279p(str2);
                        m79806f(length2, str2.length());
                        str2.getChars(0, str2.length(), (char[]) this.f215892e, length2);
                        length2 = str2.length() + length2;
                    } else {
                        char[] cArr2 = (char[]) this.f215892e;
                        cArr2[length2] = '\\';
                        cArr2[length2 + 1] = (char) b;
                        length2 += 2;
                    }
                }
                m79806f(length2, 1);
                char[] cArr3 = (char[]) this.f215892e;
                cArr3[length2] = '\"';
                m79794E(cArr3, length2 + 1);
                m79807g();
                return;
            }
            length2++;
        }
        cArr[i] = '\"';
        m79794E(cArr, length + 2);
        m79807g();
    }

    @Override // p204p.hg50
    /* JADX INFO: renamed from: s */
    public void mo33249s(String str) throws IOException {
        int length = str.length();
        m79806f(0, length);
        str.getChars(0, length, (char[]) this.f215892e, 0);
        m79794E((char[]) this.f215892e, length);
    }

    /* JADX INFO: renamed from: t */
    public Object m79814t(fz61 fz61Var) {
        bz61 bz61Var = (bz61) this.f215890c;
        Object objMo26518k = bz61Var.mo26518k(fz61Var);
        if (objMo26518k != null || this.f215889b != 0) {
            return objMo26518k;
        }
        throw new DateTimeException("Unable to extract value: " + bz61Var.getClass());
    }

    public String toString() {
        switch (this.f215888a) {
            case 5:
                return ((bz61) this.f215890c).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m79815u() {
        q6q0 q6q0Var = (q6q0) this.f215892e;
        if (this.f215889b == 2) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            p6q0 p6q0Var = new p6q0(q6q0Var, 0);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            p6q0Var.invoke(motionEventObtain);
            motionEventObtain.recycle();
            this.f215889b = 1;
            q6q0Var.f185906c = false;
            this.f215891d = null;
        }
    }

    /* JADX INFO: renamed from: v */
    public void m79816v(AbstractC1861fi abstractC1861fi) {
        String str;
        qre0 qre0Var = (qre0) this.f215890c;
        ew1 ew1VarM6717q = AddressCollectionError.m6717q();
        ew1VarM6717q.m40118m(((UUID) this.f215892e).toString());
        ew1VarM6717q.m40119q(abstractC1861fi.mo41686b());
        sw1 sw1Var = abstractC1861fi instanceof sw1 ? (sw1) abstractC1861fi : null;
        if (sw1Var != null && (str = sw1Var.f214554c) != null) {
            ew1VarM6717q.m40120r(str);
        }
        qre0Var.m73616a(ew1VarM6717q.build());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: w */
    public void m79817w(e6q0 e6q0Var, f6q0 f6q0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        q6q0 q6q0Var = (q6q0) this.f215892e;
        ?? r1 = e6q0Var.f56704a;
        int size = r1.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            k6q0 k6q0Var = (k6q0) r1.get(i);
            if (ex60.m40176j(k6q0Var) || ex60.m40178l(k6q0Var)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = r1.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (((k6q0) r1.get(i2)).m55612l()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (q6q0Var.f185906c) {
            z3 = true;
            break;
        }
        int size3 = r1.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                k6q0 k6q0Var2 = (k6q0) r1.get(i3);
                if (!ex60.m40176j(k6q0Var2) && !ex60.m40178l(k6q0Var2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        int i4 = this.f215889b;
        f6q0 f6q0Var2 = f6q0.f66487c;
        if (i4 != 3) {
            if (f6q0Var == f6q0.f66485a && z3) {
                this.f215891d = e6q0Var;
                m79803c(e6q0Var, !z || q6q0Var.f185906c);
            }
            if (f6q0Var == f6q0.f66486b && z && e6q0Var.equals((e6q0) this.f215891d) && q6q0Var.f185906c) {
                int size4 = r1.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((k6q0) r1.get(i5)).m55602a();
                }
            }
            if (f6q0Var == f6q0Var2 && !z3 && !e6q0Var.equals((e6q0) this.f215891d)) {
                m79803c(e6q0Var, true);
            }
        }
        if (f6q0Var == f6q0Var2) {
            int size5 = r1.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    this.f215889b = 1;
                    q6q0Var.f185906c = false;
                    this.f215891d = null;
                    break;
                } else if (!ex60.m40178l((k6q0) r1.get(i6))) {
                    break;
                } else {
                    i6++;
                }
            }
            if (e6q0Var.equals((e6q0) this.f215891d) && z) {
                int size6 = r1.size();
                for (int i7 = 0; i7 < size6; i7++) {
                    if (((k6q0) r1.get(i7)).m55612l()) {
                        if (q6q0Var.f185906c) {
                            break;
                        }
                        m79793D(e6q0Var);
                        return;
                    }
                }
                int size7 = r1.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    ((k6q0) r1.get(i8)).m55602a();
                }
            }
        }
    }

    @Override // p204p.hg50
    public void writeLong(long j) throws IOException {
        mo33249s(String.valueOf(j));
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        dx40 dx40VarMo51806g = swd1Var.f214650a.mo51806g(519);
        ((cgl) this.f215890c).m32727a((View) this.f215891d, dx40VarMo51806g.f53848a, this.f215889b);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f215892e;
        adk adkVar = new adk(dx40VarMo51806g, 14);
        c7j c7jVar = new c7j();
        c7jVar.m31736f(constraintLayout);
        adkVar.invoke(c7jVar);
        c7jVar.m31733b(constraintLayout);
        return swd1Var;
    }

    /* JADX INFO: renamed from: y */
    public void m79818y() {
        HandlerThread handlerThread;
        synchronized (this.f215890c) {
            try {
                c95.m31855u(this.f215889b > 0);
                int i = this.f215889b - 1;
                this.f215889b = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.f215892e) != null) {
                    handlerThread.quit();
                    this.f215892e = null;
                    this.f215891d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public Single m79819z(Single single) {
        return single.map(new ln9(this, 13)).doOnError(new g8f(this, 2));
    }

    public /* synthetic */ t0h1(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.f215888a = i2;
        this.f215890c = obj;
        this.f215891d = obj2;
        this.f215889b = i;
        this.f215892e = obj3;
    }

    public /* synthetic */ t0h1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f215888a = i2;
        this.f215890c = obj;
        this.f215891d = obj2;
        this.f215892e = obj3;
        this.f215889b = i;
    }

    public t0h1(h6h1 h6h1Var, int i, xeg1 xeg1Var) {
        this.f215888a = 25;
        this.f215890c = h6h1Var;
        this.f215889b = i;
        this.f215891d = xeg1Var;
    }

    public t0h1(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f215888a = 0;
        this.f215892e = new rng1(this);
        this.f215889b = 1;
        this.f215891d = scheduledExecutorService;
        this.f215890c = context.getApplicationContext();
    }

    public t0h1(int i, yrv yrvVar) {
        this.f215888a = 18;
        this.f215890c = yrvVar;
        this.f215889b = i;
        this.f215892e = new WeakHashMap();
    }

    public t0h1(FileOutputStream fileOutputStream) {
        this.f215888a = 11;
        this.f215890c = fileOutputStream;
        this.f215891d = iua.f105897c.m54335y(512);
        this.f215892e = otc.f169033c.m70924V0(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t0h1(er70 er70Var, vaa1 vaa1Var) {
        this.f215888a = 15;
        ArrayList arrayList = new ArrayList();
        a6b a6bVar = (a6b) er70Var.get();
        y5b y5bVar = new y5b(253, null);
        e6b e6bVar = (e6b) a6bVar;
        e6bVar.getClass();
        this.f215890c = vjf1.m85770t(dau.f47107a, new b6b((Object) e6bVar, (Object) y5bVar, (fbk) (0 == true ? 1 : 0), 0)).map(zzx.f288130R0);
        this.f215891d = Observable.defer(new qj11(vaa1Var, 5)).firstOrError().doOnSuccess(C2234p.f172405Z0).onErrorReturnItem(lau.f131415a);
        this.f215892e = Single.just(arrayList).flatMap(new cz90(this, 27)).onErrorResumeNext(u6j0.f227372e);
    }

    public t0h1(q6q0 q6q0Var) {
        this.f215888a = 19;
        this.f215892e = q6q0Var;
        this.f215889b = 1;
    }

    public t0h1(tqi0 tqi0Var) {
        this.f215888a = 13;
        Activity activity = tqi0Var.f222820a;
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.watch_feed_back_button_slot_size);
        zv41 zv41VarM52819d = jag1.m52819d(0);
        this.f215890c = zv41VarM52819d;
        this.f215891d = zv41VarM52819d;
        this.f215892e = new Rect(0, 0, dimensionPixelSize, dimensionPixelSize);
        this.f215889b = activity.getResources().getDimensionPixelSize(R.dimen.watch_feed_action_toolbar_center_end_guide);
    }

    public t0h1(String str, SecretKeySpec secretKeySpec) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        this.f215888a = 20;
        byte b = 1;
        u1q u1qVar = new u1q(this, 1);
        this.f215890c = u1qVar;
        this.f215891d = str;
        this.f215892e = secretKeySpec;
        if (secretKeySpec.getEncoded().length >= 16) {
            switch (str.hashCode()) {
                case -1823053428:
                    b = !str.equals("HMACSHA1") ? (byte) -1 : (byte) 0;
                    break;
                case 392315118:
                    if (!str.equals("HMACSHA256")) {
                        b = -1;
                    }
                    break;
                case 392316170:
                    b = !str.equals("HMACSHA384") ? (byte) -1 : (byte) 2;
                    break;
                case 392317873:
                    b = !str.equals("HMACSHA512") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    this.f215889b = 20;
                    break;
                case 1:
                    this.f215889b = 32;
                    break;
                case 2:
                    this.f215889b = 48;
                    break;
                case 3:
                    this.f215889b = 64;
                    break;
                default:
                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            u1qVar.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }

    public t0h1(Context context, int i) {
        this.f215888a = i;
        switch (i) {
            case 7:
                this.f215890c = context.getApplicationContext();
                this.f215891d = new wwo(18);
                this.f215889b = -2000;
                this.f215892e = wra.f254303g;
                break;
            default:
                this.f215890c = context;
                this.f215889b = -1;
                break;
        }
    }

    public t0h1(w591 w591Var) {
        this.f215888a = 8;
        this.f215890c = w591Var;
        this.f215892e = new qqi0(0, new gh00[16]);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public t0h1(bz61 bz61Var, bno bnoVar) {
        dce[] dceVarArrValues;
        int length;
        int i;
        dce dceVar;
        gze1 gze1VarMo60301a;
        this.f215888a = 5;
        ice iceVar = bnoVar.f28907e;
        gze1 gze1Var = bnoVar.f28908f;
        if (iceVar != null || gze1Var != null) {
            ice iceVar2 = (ice) bz61Var.mo26518k(ez61.f64286b);
            gze1 gze1Var2 = (gze1) bz61Var.mo26518k(ez61.f64285a);
            jba0 jba0VarM52882o6 = null;
            iceVar = jlg1.m53704n(iceVar2, iceVar) ? null : iceVar;
            gze1Var = jlg1.m53704n(gze1Var2, gze1Var) ? null : gze1Var;
            if (iceVar != null || gze1Var != null) {
                ice iceVar3 = iceVar != null ? iceVar : iceVar2;
                gze1Var2 = gze1Var != null ? gze1Var : gze1Var2;
                if (gze1Var != null) {
                    if (bz61Var.mo26516d(dce.INSTANT_SECONDS)) {
                        if (iceVar3 == null) {
                            np50 np50Var = np50.f156881a;
                        }
                        bz61Var = pze1.m71734n6(z050.m95038n6(bz61Var), gze1Var);
                    } else {
                        try {
                            mze1 mze1VarMo46200f = gze1Var.mo46200f();
                            gze1VarMo60301a = mze1VarMo46200f.mo60305e() ? mze1VarMo46200f.mo60301a(z050.f277960f) : gze1Var;
                        } catch (ZoneRulesException unused) {
                        }
                        hze1 hze1Var = (hze1) bz61Var.mo26518k(ez61.f64289e);
                        if ((gze1VarMo60301a instanceof hze1) && hze1Var != null && !gze1VarMo60301a.equals(hze1Var)) {
                            throw new DateTimeException("Invalid override zone for temporal: " + gze1Var + " " + bz61Var);
                        }
                        if (iceVar != null) {
                            if (bz61Var.mo26516d(dce.EPOCH_DAY)) {
                                ((np50) iceVar3).getClass();
                                jba0VarM52882o6 = jba0.m52882o6(bz61Var);
                            } else if (iceVar == np50.f156881a) {
                                dceVarArrValues = dce.values();
                                length = dceVarArrValues.length;
                                for (i = 0; i < length; i++) {
                                    dceVar = dceVarArrValues[i];
                                    if (!dceVar.isDateBased()) {
                                    }
                                }
                            } else {
                                dceVarArrValues = dce.values();
                                length = dceVarArrValues.length;
                                while (i < length) {
                                    dceVar = dceVarArrValues[i];
                                    if (!dceVar.isDateBased()) {
                                    }
                                }
                            }
                        }
                        bz61Var = new wno(jba0VarM52882o6, bz61Var, iceVar3, gze1Var2);
                    }
                } else {
                    if (iceVar != null) {
                        if (bz61Var.mo26516d(dce.EPOCH_DAY)) {
                            ((np50) iceVar3).getClass();
                            jba0VarM52882o6 = jba0.m52882o6(bz61Var);
                        } else if (iceVar == np50.f156881a || iceVar2 != null) {
                            dceVarArrValues = dce.values();
                            length = dceVarArrValues.length;
                            while (i < length) {
                                dceVar = dceVarArrValues[i];
                                if (!dceVar.isDateBased() && bz61Var.mo26516d(dceVar)) {
                                    throw new DateTimeException("Invalid override chronology for temporal: " + iceVar + " " + bz61Var);
                                }
                            }
                        }
                    }
                    bz61Var = new wno(jba0VarM52882o6, bz61Var, iceVar3, gze1Var2);
                }
            }
        }
        this.f215890c = bz61Var;
        this.f215891d = bnoVar.f28904b;
        this.f215892e = bnoVar.f28905c;
    }

    public t0h1(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f215888a = 23;
        this.f215890c = str;
        this.f215889b = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f215891d = listUnmodifiableList;
        this.f215892e = bArr;
    }

    public t0h1(int i) {
        this.f215888a = 24;
        Float fValueOf = Float.valueOf(0.0f);
        this.f215889b = i;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = 1.0f;
        }
        this.f215890c = fArr;
        this.f215891d = new pqm0(fValueOf, fValueOf);
        int i3 = this.f215889b;
        ldd1[] ldd1VarArr = new ldd1[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            ldd1VarArr[i4] = new ldd1(1.0f);
        }
        this.f215892e = ldd1VarArr;
    }

    public t0h1(int i, byte b) {
        this.f215888a = i;
        switch (i) {
            case 17:
                this.f215890c = new Object();
                this.f215891d = null;
                this.f215892e = null;
                this.f215889b = 0;
                break;
            default:
                this.f215890c = new SparseIntArray[9];
                this.f215891d = new ArrayList();
                this.f215892e = new n900(this);
                this.f215889b = 1;
                break;
        }
    }
}
