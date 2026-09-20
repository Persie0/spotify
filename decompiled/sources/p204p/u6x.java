package p204p;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Duration;
import com.spotify.authentication.tokenexchangeapi.TokenExchangeException;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.profileconfig.proto.p131v1.Avatar;
import com.spotify.puffin.core.domain.usecases.GetFawFilterException;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.MaybeEmitter;
import io.reactivex.rxjava3.core.MaybeOnSubscribe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromCallable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnErrorNext;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.IsCuratedItem;

/* JADX INFO: loaded from: classes8.dex */
public final class u6x implements ant, x920, Function, rdc1, iab, MaybeOnSubscribe, SingleOnSubscribe, nar0, lk30, BiFunction, gg50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f227446a;

    /* JADX INFO: renamed from: b */
    public final Object f227447b;

    public /* synthetic */ u6x(Object obj, int i) {
        this.f227446a = i;
        this.f227447b = obj;
    }

    /* JADX INFO: renamed from: l */
    public static void m82465l(ImageView imageView, wb40 wb40Var, tfs tfsVar) {
        if (tfsVar == null) {
            ((lxe) wb40Var).m60185k(imageView, null);
            return;
        }
        rlv0 rlv0Var = new rlv0();
        i2v i2vVar = new i2v(rlv0Var, 24);
        k940 k940Var = (k940) imageView.getTag(R.id.imageloader_target);
        if (k940Var == null) {
            k940Var = new k940(imageView, tfsVar);
            imageView.setTag(R.id.imageloader_target, k940Var);
        }
        k940Var.f120516c = i2vVar;
        k940Var.f120515b = tfsVar;
        Object tag = imageView.getTag(R.id.hubs_view_bound_image_request);
        tdc1 tdc1Var = tag instanceof tdc1 ? (tdc1) tag : null;
        if (tdc1Var != null) {
            tdc1Var.m80503a();
        }
        tdc1 tdc1Var2 = new tdc1(imageView, wb40Var);
        imageView.setTag(R.id.hubs_view_bound_image_request, tdc1Var2);
        imageView.addOnAttachStateChangeListener(tdc1Var2);
        rlv0Var.f200373a = tdc1Var2;
        tdc1Var2.f219281c = k940Var;
        try {
            wb40 wb40Var2 = tdc1Var2.f219279a;
            if (wb40Var2 != null) {
                ((lxe) wb40Var2).m60184j(tdc1Var2);
            }
        } catch (RuntimeException e) {
            tdc1Var2.m80503a();
            throw e;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final u6x m82466m(i070 i070Var) throws GeneralSecurityException {
        if (i070Var.m49304p() > 0) {
            return new u6x(i070Var, 26);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* JADX INFO: renamed from: p */
    public static final u6x m82467p(azu0 azu0Var, y94 y94Var) throws GeneralSecurityException {
        n1v n1vVarM63525q = n1v.m63525q(azu0Var.m27683q(), ztx.m96955a());
        if (n1vVarM63525q.m63526o().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            i070 i070VarM49302t = i070.m49302t(y94Var.mo24593b(n1vVarM63525q.m63526o().m42777i(), new byte[0]), ztx.m96955a());
            if (i070VarM49302t.m49304p() > 0) {
                return new u6x(i070VarM49302t, 26);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    @Override // p204p.nar0
    /* JADX INFO: renamed from: a */
    public Long mo64035a() {
        m4l0 m4l0Var;
        Duration duration;
        x430 x430Var = (x430) this.f227447b;
        if (x430Var == null || (m4l0Var = x430Var.f257971d) == null || (duration = m4l0Var.f139992b) == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis(duration.m1932r()));
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        boolean isCurated;
        IsCuratedItem isCuratedItem = (IsCuratedItem) obj;
        o221 o221Var = (o221) obj2;
        vu40 vu40Var = (vu40) this.f227447b;
        if (!o221Var.f160923a) {
            isCurated = isCuratedItem.getIsCurated();
        } else if (o221Var.f160924b) {
            isCurated = true;
        } else {
            isCurated = o221Var.f160926d ? isCuratedItem.getIsInCollection() : false;
        }
        return vu40Var.m86410b(isCurated);
    }

    @Override // p204p.x920
    /* JADX INFO: renamed from: b */
    public Object mo36147b(Object obj) {
        return ((aqx) obj).type();
    }

    @Override // p204p.gg50
    /* JADX INFO: renamed from: c */
    public int mo25121c(char[] cArr, int i, int i2) {
        return ((tuc) this.f227447b).m81558a(cArr, i, i2);
    }

    @Override // p204p.nar0
    /* JADX INFO: renamed from: d */
    public Long mo64036d() {
        m4l0 m4l0Var;
        Duration duration;
        x430 x430Var = (x430) this.f227447b;
        if (x430Var == null || (m4l0Var = x430Var.f257971d) == null || (duration = m4l0Var.f139991a) == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis(duration.m1932r()));
    }

    @Override // p204p.nar0
    /* JADX INFO: renamed from: e */
    public String mo64037e() {
        x430 x430Var = (x430) this.f227447b;
        if (x430Var != null) {
            return x430Var.f257969b;
        }
        return null;
    }

    @Override // p204p.iab
    /* JADX INFO: renamed from: f */
    public void mo31884f(y8b y8bVar, IOException iOException) {
        ((hqb) this.f227447b).resumeWith(new c6x0(iOException));
    }

    @Override // p204p.x920
    /* JADX INFO: renamed from: g */
    public Iterator mo36148g() {
        return ((Iterable) this.f227447b).iterator();
    }

    @Override // p204p.nar0
    public String getImageUri() {
        x430 x430Var = (x430) this.f227447b;
        if (x430Var != null) {
            return x430Var.f257972e;
        }
        return null;
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (LinearLayout) this.f227447b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public Object m82468h(ibk ibkVar) {
        pry pryVar;
        if (ibkVar instanceof pry) {
            pryVar = (pry) ibkVar;
            int i = pryVar.f180695c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pryVar.f180695c = i - Integer.MIN_VALUE;
            } else {
                pryVar = new pry(this, ibkVar);
            }
        } else {
            pryVar = new pry(this, ibkVar);
        }
        Object objM86755t = pryVar.f180693a;
        int i2 = pryVar.f180695c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            s5u s5uVarM66217a = ((o3v) this.f227447b).m66217a();
            pryVar.f180695c = 1;
            objM86755t = vyf1.m86755t(s5uVarM66217a, pryVar);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        return new r5v((r0s) objM86755t);
    }

    /* JADX INFO: renamed from: i */
    public kn70 m82469i() {
        return (kn70) this.f227447b;
    }

    /* JADX INFO: renamed from: j */
    public void m82470j(ImageView imageView) {
        Object tag = imageView.getTag(R.id.hubs_view_bound_image_request);
        tdc1 tdc1Var = tag instanceof tdc1 ? (tdc1) tag : null;
        if (tdc1Var != null) {
            tdc1Var.m80503a();
        }
        ((e940) this.f227447b).mo24607c(imageView);
    }

    @Override // p204p.lk30
    /* JADX INFO: renamed from: k */
    public int mo25406k(fk30 fk30Var) {
        fk30Var.getClass();
        return ((Integer) ((n95) this.f227447b).m63911y(fk30Var.componentId().mo29575id()).mo49284i(new qg9(8)).mo49280e(0)).intValue();
    }

    /* JADX INFO: renamed from: n */
    public i070 m82471n() {
        return (i070) this.f227447b;
    }

    /* JADX INFO: renamed from: o */
    public Object m82472o(Class cls) throws GeneralSecurityException {
        byte[] bArrArray;
        i070 i070Var = (i070) this.f227447b;
        ier0 ier0Var = (ier0) qsv0.f192226e.get(cls);
        Class clsMo34799b = ier0Var == null ? null : ier0Var.mo34799b();
        if (clsMo34799b == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        int i = d0b1.f43839a;
        int iM49306r = i070Var.m49306r();
        Iterator it = i070Var.m49305q().iterator();
        int i2 = 1;
        byte b = 0;
        boolean z = true;
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            su60 su60Var = su60.ENABLED;
            if (!zHasNext) {
                if (i3 == 0) {
                    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
                }
                if (!z2 && !z) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                w9r0 w9r0Var = new w9r0(clsMo34799b);
                Class cls2 = (Class) w9r0Var.f249254d;
                for (h070 h070Var : i070Var.m49305q()) {
                    if (h070Var.m46267t() == su60Var) {
                        Object objM73765d = qsv0.m73765d(h070Var.m46264q().m36907r(), h070Var.m46264q().m36908s(), clsMo34799b);
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) w9r0Var.f249252b;
                        if (h070Var.m46267t() != su60Var) {
                            throw new GeneralSecurityException("only ENABLED key is allowed");
                        }
                        int iOrdinal = h070Var.m46266s().ordinal();
                        if (iOrdinal == i2) {
                            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(h070Var.m46265r()).array();
                        } else if (iOrdinal == 2) {
                            bArrArray = ByteBuffer.allocate(5).put(b).putInt(h070Var.m46265r()).array();
                        } else if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                            bArrArray = ByteBuffer.allocate(5).put(b).putInt(h070Var.m46265r()).array();
                        } else {
                            bArrArray = edo.f58550a;
                        }
                        fer0 fer0Var = new fer0(objM73765d, bArrArray, h070Var.m46267t(), h070Var.m46266s());
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(fer0Var);
                        ger0 ger0Var = new ger0(fer0Var.m41485a());
                        List list = (List) concurrentHashMap.put(ger0Var, Collections.unmodifiableList(arrayList));
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(list);
                            arrayList2.add(fer0Var);
                            concurrentHashMap.put(ger0Var, Collections.unmodifiableList(arrayList2));
                        }
                        if (h070Var.m46265r() != i070Var.m49306r()) {
                            continue;
                        } else {
                            if (fer0Var.f68822c != su60Var) {
                                throw new IllegalArgumentException("the primary entry has to be ENABLED");
                            }
                            if (w9r0Var.m87540E(fer0Var.m41485a()).isEmpty()) {
                                throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                            }
                            w9r0Var.f249253c = fer0Var;
                        }
                    }
                    i2 = 1;
                    b = 0;
                }
                ier0 ier0Var2 = (ier0) qsv0.f192226e.get(cls);
                if (ier0Var2 == null) {
                    throw new GeneralSecurityException("No wrapper found for ".concat(cls2.getName()));
                }
                if (ier0Var2.mo34799b().equals(cls2)) {
                    return ier0Var2.mo34798a(w9r0Var);
                }
                throw new GeneralSecurityException("Wrong input primitive class, expected " + ier0Var2.mo34799b() + ", got " + cls2);
            }
            h070 h070Var2 = (h070) it.next();
            if (h070Var2.m46267t() == su60Var) {
                if (!h070Var2.m46268u()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(h070Var2.m46265r())));
                }
                if (h070Var2.m46266s() == hzl0.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(h070Var2.m46265r())));
                }
                if (h070Var2.m46267t() == su60.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(h070Var2.m46265r())));
                }
                if (h070Var2.m46265r() == iM49306r) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                if (h070Var2.m46264q().m36906q() != cu60.ASYMMETRIC_PUBLIC) {
                    z = false;
                }
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m82473q(boolean z) {
        ((kn70) this.f227447b).f124322c = z;
    }

    /* JADX INFO: renamed from: r */
    public void m82474r(boolean z) {
        ((kn70) this.f227447b).f124320a = z;
    }

    @Override // io.reactivex.rxjava3.core.MaybeOnSubscribe
    public void subscribe(MaybeEmitter maybeEmitter) {
        if (maybeEmitter.isDisposed()) {
            return;
        }
        u790 u790Var = (u790) this.f227447b;
        int i = 22;
        u790Var.mo28322a(new lk00(i, u790Var, new i2v(maybeEmitter, 16)), ckr.f39074a);
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        z3x z3xVar = (z3x) obj;
        s8p s8pVar = (s8p) this.f227447b;
        wj50.m88279p(z3xVar);
        sdo sdoVar = (sdo) s8pVar.f206698f;
        if (z3xVar.f279052e == null || z3xVar.f279051d == null) {
            ((CalendarIconView) sdoVar.f208050d).setVisibility(8);
        } else {
            ((CalendarIconView) sdoVar.f208050d).setVisibility(0);
            ((CalendarIconView) sdoVar.f208050d).mo2820d(new q8b(124, null, null, z3xVar.f279051d, z3xVar.f279052e, false));
        }
    }

    public String toString() {
        switch (this.f227446a) {
            case 26:
                return d0b1.m34533a((i070) this.f227447b).toString();
            default:
                return super.toString();
        }
    }

    @Override // p204p.iab
    /* JADX INFO: renamed from: y */
    public void mo31897y(y8b y8bVar, n2x0 n2x0Var) {
        ((hqb) this.f227447b).resumeWith(n2x0Var);
    }

    public u6x() {
        this.f227446a = 28;
        this.f227447b = new kn70();
    }

    public u6x(FileInputStream fileInputStream) {
        this.f227446a = 25;
        this.f227447b = new tuc(fileInputStream, vuc.f244913a);
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        if (((hc80) ((vo20) this.f227447b).f243336a.get()).getLifecycle().mo31987b() == fb80.f67752c) {
            singleEmitter.onSuccess(new rk91("headless_startup"));
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) throws Throwable {
        int i = this.f227446a;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        Object obj2 = this.f227447b;
        switch (i) {
            case 3:
                eag0 eag0Var = ((myx) obj2).f148555h;
                eag0Var.getClass();
                dv91 dv91Var = new dv91("hit", 1);
                String string = ((String) obj).toString();
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("dislike", 1, Collections.singletonMap("item_to_be_disliked", string)), eag0Var.f57667c, eag0Var.f57666b, System.currentTimeMillis());
            case 4:
                Throwable th = (Throwable) obj;
                if (!(th instanceof TokenExchangeException) && !(th instanceof TimeoutException)) {
                    throw th;
                }
                return (Uri) obj2;
            case 10:
                zhn0 zhn0Var = (zhn0) obj;
                x31 x31Var = new x31(9, (d300) obj2, zhn0Var);
                int i2 = Flowable.f7192a;
                return new FlowableOnErrorNext(new FlowableFromCallable(x31Var), new i2v(zhn0Var, 14));
            case 11:
                return Boolean.valueOf(((j2r) obj2).m52231m((ContextTrack) obj));
            case 13:
                return Observable.fromIterable(((w410) obj).f247675a).flatMapSingle(new i2v((u010) obj2, 18)).toList();
            case 14:
                m951 m951Var = (m951) obj2;
                na6.m63957e("[Puffin] Error getting raw filter " + m951Var + ": " + ((Throwable) obj));
                return Single.error(new GetFawFilterException(m951Var));
            case 15:
                hv31 hv31Var = (hv31) obj;
                oo10 oo10Var = (oo10) obj2;
                String strMo48710e = hv31Var.mo48710e(oo10.f167433g, null);
                if (strMo48710e != null) {
                    return Single.just(strMo48710e);
                }
                return oo10Var.f167434a.m58378a(k6n0.GOOGLE).subscribeOn(oo10Var.f167438e).observeOn(oo10Var.f167437d).compose(new kq11(2)).doOnSuccess(new p8v(hv31Var, 20));
            case 21:
                return new CompletableFromAction(new h331((j331) obj2, (String) obj, z ? 1 : 0));
            case 23:
                qbt0 qbt0Var = (qbt0) obj;
                ((ni00) obj2).getClass();
                if (qbt0Var instanceof jbt0) {
                    z = true;
                } else if (!(qbt0Var instanceof mbt0) && !wj50.m88271j(qbt0Var, hbt0.f89605a) && !wj50.m88271j(qbt0Var, ibt0.f100669a) && !wj50.m88271j(qbt0Var, kbt0.f121278a) && !wj50.m88271j(qbt0Var, lbt0.f131718a) && !wj50.m88271j(qbt0Var, nbt0.f152349a) && !wj50.m88271j(qbt0Var, obt0.f163718a) && !(qbt0Var instanceof pbt0)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            case 24:
                nx50 nx50Var = (nx50) obj;
                ((wk9) obj2).getClass();
                if (nx50Var.f159368a && !nx50Var.f159369b) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                List<Avatar> list = (List) obj;
                s18 s18Var = (s18) obj2;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                for (Avatar avatar : list) {
                    wj50.m88279p(avatar);
                    t670 t670Var = new t670(avatar.getName(), avatar.getImageUrl(), avatar.getDescription());
                    String imageUrl = avatar.getImageUrl();
                    arrayList.add(new kkz0(t670Var, (imageUrl == null || wl51.m88460J0(imageUrl) || !wj50.m88271j(avatar.getImageUrl(), (String) s18Var.f204622d)) ? false : true));
                }
                return arrayList;
        }
    }
}
