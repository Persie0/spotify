package p204p;

import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import com.spotify.cosmos.cosmos.Response;
import com.spotify.endless.sessionstarter.EndlessActivity;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeEmitter;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;

/* JADX INFO: loaded from: classes6.dex */
public final class i2v implements r7l0, Predicate, Function, li00, wh00, ant, qio, fk00, mu61, InterfaceC2207oa {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f97924a;

    /* JADX INFO: renamed from: b */
    public Object f97925b;

    public /* synthetic */ i2v(Object obj, int i) {
        this.f97924a = i;
        this.f97925b = obj;
    }

    /* JADX INFO: renamed from: B */
    public static ArrayList m49503B(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tx50 tx50Var = (tx50) it.next();
            arrayList2.add(new q360(tx50Var.f224565a, tx50Var.f224568d, tx50Var.f224566b, tx50Var.f224569e));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: u */
    public static i2v m49504u(String str, byte[] bArr) {
        hzl0 hzl0Var;
        tu60 tu60VarM83971t = uu60.m83971t();
        tu60VarM83971t.m60484d();
        uu60.m83967m((uu60) tu60VarM83971t.f138791b, str);
        bva bvaVarM42776d = fva.m42776d(0, bArr, bArr.length);
        tu60VarM83971t.m60484d();
        uu60.m83968n((uu60) tu60VarM83971t.f138791b, bvaVarM42776d);
        int iM38547C = edb.m38547C(1);
        if (iM38547C == 0) {
            hzl0Var = hzl0.TINK;
        } else if (iM38547C == 1) {
            hzl0Var = hzl0.LEGACY;
        } else if (iM38547C == 2) {
            hzl0Var = hzl0.RAW;
        } else {
            if (iM38547C != 3) {
                throw new IllegalArgumentException("Unknown output prefix type");
            }
            hzl0Var = hzl0.CRUNCHY;
        }
        tu60VarM83971t.m60484d();
        uu60.m83969o((uu60) tu60VarM83971t.f138791b, hzl0Var);
        return new i2v((uu60) tu60VarM83971t.m60482b(), 29);
    }

    /* JADX INFO: renamed from: A */
    public void m49505A(String str) {
        ((ogx) this.f97925b).f165285a = str;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((zdd1) this.f97925b).m95918d();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f97924a) {
            case 3:
                ha3 ha3Var = (ha3) this.f97925b;
                wj50.m88279p(ha3Var);
                return mmv.m62337a((mmv) obj, ha3Var);
            case 5:
                hrw hrwVar = (hrw) this.f97925b;
                return hrwVar.m48413b(new xcw(6, SkipToNextTrackCommand.create(), hrwVar)).flatMap(new arw(hrwVar, 1));
            case 9:
                ((hyx) this.f97925b).f96701k.getClass();
                return "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ";
            case 13:
                dcz dczVar = (dcz) this.f97925b;
                if (((Boolean) obj).booleanValue()) {
                    return Single.just(Boolean.FALSE);
                }
                tre1 tre1Var = dczVar.f47666b;
                jqe1 jqe1VarM98173q = YourLibraryRequest.m98173q();
                jqe1VarM98173q.m54088s(100);
                kqe1 kqe1VarM98179G = YourLibraryRequestHeader.m98179G();
                aoe1 aoe1VarM98214r = YourLibraryConfig$YourLibraryFilters.m98214r();
                aoe1VarM98214r.m26586q(boe1.PLAYLIST);
                aoe1VarM98214r.m26586q(boe1.BY_YOU);
                kqe1VarM98179G.m57107u((YourLibraryConfig$YourLibraryFilters) aoe1VarM98214r.build());
                kqe1VarM98179G.m57093C(1);
                kqe1VarM98179G.m57096F(0);
                jqe1VarM98173q.m54086q((YourLibraryRequestHeader) kqe1VarM98179G.build());
                return tre1Var.m81347b((YourLibraryRequest) jqe1VarM98173q.build()).map(fby.f67940c).first(Boolean.TRUE).map(new k9u(dczVar, 10));
            case 14:
                return Flowable.m23313I(new pqm0((zhn0) this.f97925b, (Throwable) obj));
            case 15:
                return k0e1.m54986e(((tsb) this.f97925b).mo24819a((ContextTrack) obj), dau.f47107a);
            case 17:
                Boolean bool = (Boolean) obj;
                su00 su00Var = (su00) this.f97925b;
                return (su00Var.f213970b.isEmpty() || !bool.booleanValue()) ? MaybeEmpty.f8264a : Maybe.m23363f(new pqm0(su00Var.f213969a, su00Var.f213971c.f247544a));
            case 18:
                l410 l410Var = (l410) obj;
                u010 u010Var = (u010) this.f97925b;
                t6f0 t6f0Var = (t6f0) u010Var.f225345b;
                List list = l410Var.f129478b;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((div0) it.next()).f49493a);
                }
                return t6f0Var.m80159a(arrayList).map((x74) u010Var.f225347d).map(new k9u(l410Var, 15));
            case 20:
                oo10 oo10Var = (oo10) this.f97925b;
                return oo10Var.f167435b.mo35842b(oo10Var.f167439f, (String) obj);
            case 22:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                v430 v430Var = (v430) this.f97925b;
                return zBooleanValue ? (ouo0) v430Var.f237036e.getValue() : (ouo0) v430Var.f237035d.getValue();
            default:
                fk60 fk60Var = (fk60) this.f97925b;
                rr60 rr60VarSerializer = az71.Companion.serializer();
                byte[] body = ((Response) obj).getBody();
                if (body == null) {
                    body = new byte[0];
                }
                return (az71) fk60Var.m41880a(new String(body, vuc.f244913a), rr60VarSerializer);
        }
    }

    @Override // p204p.li00
    public mi00 build() {
        return (xew) this.f97925b;
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        Exception excM65555t;
        mzx0 mzx0Var = (mzx0) this.f97925b;
        boolean zMo1518j = task.mo1518j();
        w2a1 w2a1Var = w2a1.f247311a;
        if (zMo1518j) {
            mzx0Var.resumeWith(w2a1Var);
            return;
        }
        Exception excMo1514f = task.mo1514f();
        if (excMo1514f == null || (excM65555t = nsg1.m65555t(excMo1514f)) == null) {
            mzx0Var.resumeWith(w2a1Var);
        } else {
            mzx0Var.resumeWith(new c6x0(excM65555t));
        }
    }

    @Override // p204p.fk00
    public void onFailure(Throwable th) {
        MaybeEmitter maybeEmitter = (MaybeEmitter) this.f97925b;
        if (maybeEmitter.isDisposed()) {
            return;
        }
        maybeEmitter.onError(th);
    }

    @Override // p204p.fk00
    public void onSuccess(Object obj) {
        MaybeEmitter maybeEmitter = (MaybeEmitter) this.f97925b;
        if (obj == null || maybeEmitter.isDisposed()) {
            maybeEmitter.onComplete();
        } else {
            maybeEmitter.onSuccess(obj);
        }
    }

    @Override // p204p.mu61
    /* JADX INFO: renamed from: p */
    public void mo25096p(Exception exc) {
        Object obj = ((rlv0) this.f97925b).f200373a;
        if (obj != null) {
            ((tdc1) obj).m80504b();
        } else {
            wj50.m88260d0("boundRequest");
            throw null;
        }
    }

    @Override // p204p.qio
    /* JADX INFO: renamed from: p0 */
    public uio mo30418p0() {
        rvy rvyVar = new rvy(false);
        x491 x491Var = (x491) this.f97925b;
        if (x491Var != null) {
            rvyVar.mo29278a(x491Var);
        }
        return rvyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public Object m49522r(ibk ibkVar) {
        fry fryVar;
        if (ibkVar instanceof fry) {
            fryVar = (fry) ibkVar;
            int i = fryVar.f72681c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fryVar.f72681c = i - Integer.MIN_VALUE;
            } else {
                fryVar = new fry(this, ibkVar);
            }
        } else {
            fryVar = new fry(this, ibkVar);
        }
        Object objM82127a = fryVar.f72679a;
        int i2 = fryVar.f72681c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM82127a);
                u0s u0sVar = (u0s) this.f97925b;
                fryVar.f72681c = 1;
                objM82127a = u0sVar.m82127a(fryVar);
                yuk yukVar = yuk.f276404a;
                if (objM82127a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM82127a);
            }
            return new k5v((Set) objM82127a);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return q5v.f185613a;
        }
    }

    /* JADX INFO: renamed from: s */
    public ogx m49523s() {
        return (ogx) this.f97925b;
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        ((TextView) ((sdo) ((s8p) this.f97925b).f206698f).f208052f).setText((String) obj);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return uqv.m83815a((PlayerState) obj, ((uqv) this.f97925b).f233121a);
    }

    /* JADX INFO: renamed from: v */
    public lrg1 m49524v() {
        Set set = dd41.f47702f;
        String stringExtra = ((EndlessActivity) ((smm0) this.f97925b)).getIntent().getStringExtra("com.spotify.endless.sessionstarter.KEY_EXTRA_DEEPLINK");
        if (stringExtra == null) {
            stringExtra = "";
        }
        dd41 dd41VarM74726U = r46.m74726U(stringExtra);
        int iOrdinal = dd41VarM74726U.f47709c.ordinal();
        if (iOrdinal == 484) {
            String strM35717o = dd41VarM74726U.m35717o(1);
            if (strM35717o == null) {
                strM35717o = "your-dj";
            }
            return new c2v(strM35717o);
        }
        if (iOrdinal != 485) {
            throw new IllegalArgumentException("pageUri not supported by EndlessContext");
        }
        String strM35717o2 = dd41VarM74726U.m35717o(1);
        if (strM35717o2 == null) {
            strM35717o2 = "todays-feed";
        }
        return new b2v(strM35717o2);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: w */
    public String m49525w(long j, String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArrM43718e1;
        ezk0 ezk0Var = (ezk0) this.f97925b;
        if (wl51.m88460J0(str2)) {
            throw new IllegalArgumentException("Preset name cannot be null or empty");
        }
        ?? r2 = ezk0Var.f64409b;
        Locale locale = Locale.ROOT;
        jnl0 jnl0Var = (jnl0) r2.get(str2.toUpperCase(locale));
        if (jnl0Var == null) {
            throw new IllegalArgumentException("Unknown preset: ".concat(str2));
        }
        int i = jnl0Var.f114131b;
        int i2 = jnl0Var.f114132c;
        int i3 = jnl0Var.f114133d;
        if (wl51.m88460J0(str)) {
            throw new IllegalArgumentException("Shared secret cannot be null or empty");
        }
        String upperCase = wl51.m88494r1(str, '=').toUpperCase(locale);
        ArrayList arrayList = new ArrayList();
        int length = upperCase.length();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i4 >= length) {
                bArrM43718e1 = g6f.m43718e1(arrayList);
                break;
            }
            int iM88457G0 = wl51.m88457G0("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", upperCase.charAt(i4), 0, 6);
            if (iM88457G0 == -1) {
                bArrM43718e1 = null;
                break;
            }
            i5 = (i5 << 5) | iM88457G0;
            int i7 = i6 + 5;
            if (i7 >= 8) {
                i6 -= 3;
                arrayList.add(Byte.valueOf((byte) ((i5 >> i6) & 255)));
            } else {
                i6 = i7;
            }
            i4++;
        }
        if (bArrM43718e1 == null) {
            throw new IllegalArgumentException("Invalid Base32 shared secret");
        }
        if (1 > i2 || i2 > 18) {
            throw new IllegalArgumentException("Code digits must be between 1 and 18 (extended mode)");
        }
        if (1 > i3 || i3 >= 1001) {
            throw new IllegalArgumentException("Hash rounds must be between 1 and 1000");
        }
        byte[] bArr = new byte[8];
        long j2 = j;
        for (int i8 = 7; -1 < i8; i8--) {
            bArr[i8] = (byte) (255 & j2);
            j2 >>= 8;
        }
        Mac mac = Mac.getInstance(z0k0.m95069f(i));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM43718e1, z0k0.m95069f(i));
        mac.init(secretKeySpec);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        for (int i9 = 1; i9 < i3; i9++) {
            mac.reset();
            mac.init(secretKeySpec);
            bArrDoFinal = mac.doFinal(bArrDoFinal);
        }
        wj50.m88279p(bArrDoFinal);
        int i10 = bArrDoFinal[bArrDoFinal.length - 1] & 7;
        long j3 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            j3 = (j3 << 8) | (((long) bArrDoFinal[(i10 + i11) % bArrDoFinal.length]) & 255);
        }
        return "https://open.spotify.com/multi-user-plan-verification/code/verify/".concat(String.format(edb.m38563l("%0", i2, "d"), Arrays.copyOf(new Object[]{Long.valueOf((Long.MAX_VALUE & j3) % ((long) Math.pow(10.0d, i2)))}, 1)));
    }

    /* JADX INFO: renamed from: x */
    public m12 m49526x(ExternalAccessoryDescription externalAccessoryDescription) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        UUID uuidRandomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder();
        sb.append(jCurrentTimeMillis);
        sb.append(uuidRandomUUID);
        return new m12(externalAccessoryDescription, (Object) sb.toString(), this.f97925b, 10);
    }

    /* JADX INFO: renamed from: y */
    public nfe m49527y(mov0 mov0Var) {
        st70 st70Var;
        y400 y400VarM62418v = mov0Var.m62418v();
        Class<?> declaringClass = mov0Var.f145760b.getDeclaringClass();
        mov0 mov0Var2 = declaringClass != null ? new mov0(declaringClass) : null;
        if (mov0Var2 != null) {
            nfe nfeVarM49527y = m49527y(mov0Var2);
            bfe0 bfe0VarMo30957T = nfeVarM49527y != null ? nfeVarM49527y.mo30957T() : null;
            qge qgeVarMo27571g = bfe0VarMo30957T != null ? bfe0VarMo30957T.mo27571g(mov0Var.m62420x(), pkj0.f178481h) : null;
            if (qgeVarMo27571g instanceof nfe) {
                return (nfe) qgeVarMo27571g;
            }
        } else if (y400VarM62418v != null && (st70Var = (st70) g6f.m43745s0(((tt70) this.f97925b).mo66191c(y400VarM62418v.m92786b()))) != null) {
            yt70 yt70Var = st70Var.f213831X.f156601d;
            yt70Var.getClass();
            return yt70Var.m94606u(mov0Var.m62420x(), mov0Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public void m49528z(String str) {
        ((ogx) this.f97925b).f165286b = str;
    }

    public /* synthetic */ i2v(boolean z) {
        this.f97924a = 12;
    }

    public i2v(int i) {
        this.f97924a = i;
        switch (i) {
            case 12:
                break;
            default:
                this.f97925b = new ogx();
                break;
        }
    }

    @Override // p204p.mu61
    public void onSuccess() {
        Object obj = ((rlv0) this.f97925b).f200373a;
        if (obj != null) {
            ((tdc1) obj).m80504b();
        } else {
            wj50.m88260d0("boundRequest");
            throw null;
        }
    }

    public i2v(xre xreVar, iwx0 iwx0Var) {
        this.f97924a = 10;
        this.f97925b = iwx0Var;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: d */
    public li00 mo49509d() {
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: g */
    public li00 mo49512g() {
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: i */
    public li00 mo49514i() {
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: j */
    public li00 mo49515j() {
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: m */
    public li00 mo49518m() {
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: n */
    public li00 mo49519n() {
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: q */
    public li00 mo49521q() {
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: a */
    public li00 mo49506a(List list) {
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: b */
    public li00 mo49507b(int i) {
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: c */
    public li00 mo49508c(qti0 qti0Var) {
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: e */
    public li00 mo49510e(l25 l25Var) {
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: f */
    public li00 mo49511f(uxq uxqVar) {
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: h */
    public li00 mo49513h(oqo oqoVar) {
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: k */
    public li00 mo49516k(int i) {
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: l */
    public li00 mo49517l(gd70 gd70Var) {
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: o */
    public li00 mo49520o(wr70 wr70Var) {
        return this;
    }
}
