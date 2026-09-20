package p204p;

import androidx.car.app.model.Alert;
import com.spotify.appauthorization.builtinauth.model.FieldValidator$ValidationException;
import com.spotify.base.java.logging.Logger;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.interapp.model.AbstractC0800a;
import com.spotify.interapp.model.AppProtocol$HelloDetailsAppProtocol$HelloDetails;
import com.spotify.interapp.model.AppProtocol$ListItem;
import com.spotify.interapp.model.AppProtocol$ListItems;
import com.spotify.interapp.model.AppProtocol$Metadata;
import com.spotify.interapp.model.AppProtocol$Repeat;
import com.spotify.interapp.model.AppProtocol$Shuffle;
import com.spotify.interapp.model.AppProtocol$Uri;
import com.spotify.interapp.model.AppProtocol$UriWithOptionExtras;
import com.spotify.interapp.service.service.AppProtocolRemoteService;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.observers.BlockingMultiObserver;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class a301 {

    /* JADX INFO: renamed from: B */
    public static final Pattern f11780B = Pattern.compile(",\\s*");

    /* JADX INFO: renamed from: C */
    public static final PlayOrigin f11781C;

    /* JADX INFO: renamed from: D */
    public static final ExternalAccessoryDescription f11782D;

    /* JADX INFO: renamed from: A */
    public final mcu0 f11783A;

    /* JADX INFO: renamed from: a */
    public final AppProtocolRemoteService f11784a;

    /* JADX INFO: renamed from: b */
    public final hfn f11785b;

    /* JADX INFO: renamed from: c */
    public final uzx f11786c;

    /* JADX INFO: renamed from: d */
    public final ac50 f11787d;

    /* JADX INFO: renamed from: e */
    public final qwx0 f11788e;

    /* JADX INFO: renamed from: f */
    public final Flowable f11789f;

    /* JADX INFO: renamed from: g */
    public final zxx0 f11790g;

    /* JADX INFO: renamed from: h */
    public final Flowable f11791h;

    /* JADX INFO: renamed from: i */
    public final xre f11792i;

    /* JADX INFO: renamed from: j */
    public final Scheduler f11793j;

    /* JADX INFO: renamed from: k */
    public final myx f11794k;

    /* JADX INFO: renamed from: l */
    public final vm21 f11795l;

    /* JADX INFO: renamed from: m */
    public final fzj f11796m;

    /* JADX INFO: renamed from: n */
    public final Map f11797n;

    /* JADX INFO: renamed from: o */
    public AppProtocol$HelloDetailsAppProtocol$HelloDetails f11798o;

    /* JADX INFO: renamed from: p */
    public String f11799p;

    /* JADX INFO: renamed from: q */
    public boolean f11800q;

    /* JADX INFO: renamed from: r */
    public zu0 f11801r;

    /* JADX INFO: renamed from: s */
    public m12 f11802s;

    /* JADX INFO: renamed from: t */
    public Disposable f11803t;

    /* JADX INFO: renamed from: u */
    public azx f11804u;

    /* JADX INFO: renamed from: v */
    public xzx f11805v;

    /* JADX INFO: renamed from: w */
    public g0y f11806w;

    /* JADX INFO: renamed from: x */
    public rj31 f11807x;

    /* JADX INFO: renamed from: y */
    public String f11808y = "default";

    /* JADX INFO: renamed from: z */
    public ExternalAccessoryDescription f11809z;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("inter-app-protocol");
        th50 th50Var = uh50.f230369a;
        f11781C = builder.referrerIdentifier("app_integration").build();
        f11782D = new ExternalAccessoryDescription("app_remote", "", "", "", "", "", "", "", "", "inter_app", "");
    }

    public a301(AppProtocolRemoteService appProtocolRemoteService, hfn hfnVar, uzx uzxVar, fzj fzjVar, ac50 ac50Var, Scheduler scheduler, cx21 cx21Var, qwx0 qwx0Var, Flowable flowable, zxx0 zxx0Var, Flowable flowable2, xre xreVar, myx myxVar, mcu0 mcu0Var, wm21 wm21Var, Map map) {
        this.f11784a = appProtocolRemoteService;
        this.f11785b = hfnVar;
        this.f11796m = fzjVar;
        this.f11786c = uzxVar;
        this.f11787d = ac50Var;
        this.f11788e = qwx0Var;
        this.f11789f = flowable;
        this.f11790g = zxx0Var;
        this.f11791h = flowable2;
        this.f11792i = xreVar;
        this.f11794k = myxVar;
        this.f11795l = wm21Var;
        this.f11793j = scheduler;
        this.f11783A = mcu0Var;
        this.f11797n = map;
    }

    /* JADX INFO: renamed from: a */
    public static void m24578a(HashMap map, PreparePlayOptions.Builder builder) {
        sul0 sul0Var;
        tul0 tul0Var = tul0.TRACK_UID;
        if (map.containsKey(tul0Var)) {
            String str = (String) map.get(tul0Var);
            if (str != null) {
                builder.skipTo(SkipToTrack.builder().trackUid(str).build());
                return;
            }
            return;
        }
        tul0 tul0Var2 = tul0.TRACK_URI;
        if (map.containsKey(tul0Var2)) {
            String str2 = (String) map.get(tul0Var2);
            if (str2 != null) {
                builder.skipTo(SkipToTrack.builder().trackUri(str2).build());
                return;
            }
            return;
        }
        tul0 tul0Var3 = tul0.TRACK_INDEX;
        if (!map.containsKey(tul0Var3) || (sul0Var = (sul0) map.get(tul0Var3)) == null) {
            return;
        }
        builder.skipTo(SkipToTrack.builder().trackIndex(Long.valueOf(sul0Var.f214146a)).build());
    }

    /* JADX INFO: renamed from: b */
    public static void m24579b(String str, HashMap map, PreparePlayOptions.Builder builder) {
        sul0 sul0Var;
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(str);
        he41 he41Var = dd41VarM74726U.f47710d;
        if (dd41VarM74726U.f47709c == gn80.ALBUM || (he41Var != null && he41Var.getType() == avp0.f20242e)) {
            tul0 tul0Var = tul0.TRACK_INDEX;
            if (!map.containsKey(tul0Var) || (sul0Var = (sul0) map.get(tul0Var)) == null) {
                return;
            }
            builder.skipTo(SkipToTrack.builder().pageIndex(0L).trackIndex(Long.valueOf(sul0Var.f214146a)).build());
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX INFO: renamed from: c */
    public static AppProtocol$ListItems m24580c(fxx fxxVar, int i, int i2) {
        int i3 = i;
        List list = fxxVar.f74479a;
        int i4 = i2 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i2;
        if (i4 <= 0 || i3 < 0 || i3 >= list.size()) {
            return new AppProtocol$ListItems(Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(list.size()), Arrays.asList(new AppProtocol$ListItem[0]));
        }
        ArrayList arrayList = new ArrayList(Math.min(list.size(), i4));
        int i5 = i3;
        while (i5 < i3 + i4 && i5 < list.size()) {
            axx axxVar = (axx) list.get(i5);
            String str = axxVar.f21023c;
            int i6 = axxVar.f21017E;
            if (kgg1.m56363z(str)) {
                list = list;
                i4 = i4;
            } else {
                String str2 = axxVar.f21021a;
                String str3 = axxVar.f21022b;
                String strValueOf = String.valueOf(axxVar.f21025e);
                String str4 = axxVar.f21023c;
                String str5 = axxVar.f21024d;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = str5;
                Boolean boolValueOf = Boolean.valueOf(i6 == 1);
                Boolean boolValueOf2 = Boolean.valueOf(i6 == 2);
                Boolean boolValueOf3 = Boolean.valueOf(axxVar.f21031k);
                AppProtocol$Metadata appProtocol$Metadata = new AppProtocol$Metadata();
                String str7 = axxVar.f21021a;
                Set set = dd41.f47702f;
                if (r46.m74726U(str7).f47709c == gn80.TRACK || r46.m74726U(str7).f47709c == gn80.SHOW_EPISODE) {
                    appProtocol$Metadata.isExplicitContent = Boolean.valueOf(axxVar.f21032l);
                    appProtocol$Metadata.is19PlusContent = Boolean.valueOf(axxVar.f21033m);
                    Integer num = axxVar.f21036p;
                    if (num != null) {
                        appProtocol$Metadata.duration = Long.valueOf(TimeUnit.SECONDS.toMillis(num.intValue()));
                    }
                }
                if (r46.m74726U(str7).f47709c == gn80.SHOW_EPISODE) {
                    Integer num2 = axxVar.f21037q;
                    if (num2 != null) {
                        appProtocol$Metadata.timeLeft = Long.valueOf(TimeUnit.SECONDS.toMillis(num2.intValue()));
                    }
                    appProtocol$Metadata.isPlayed = Boolean.valueOf(axxVar.f21019G == 3);
                } else {
                    i4 = i4;
                }
                arrayList.add(new AppProtocol$ListItem(str2, str3, str2, strValueOf, str4, str6, boolValueOf, boolValueOf2, boolValueOf3, appProtocol$Metadata));
            }
            i5++;
            i3 = i;
            i4 = i4;
            list = list;
        }
        return new AppProtocol$ListItems(Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(list.size()), arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static PlayOrigin m24581d(String str) {
        if (str == null) {
            return f11781C;
        }
        PlayOrigin.Builder builder = PlayOrigin.builder(str);
        th50 th50Var = uh50.f230369a;
        return builder.referrerIdentifier("app_integration").build();
    }

    /* JADX INFO: renamed from: e */
    public static String m24582e(hg40 hg40Var) {
        if (hg40Var.contains("mft_disallow") || hg40Var.contains("disallow-mft-radio")) {
            return "CANT_PLAY_ON_DEMAND";
        }
        if (hg40Var.contains("ad_disallow") || hg40Var.contains("endless_context") || hg40Var.contains("disallow-radio")) {
            return "ACTION_NOT_ALLOWED_IN_CONTEXT";
        }
        if (hg40Var.contains("invalid_uri")) {
            return "NOT_A_VALID_URI";
        }
        return hg40Var.contains("track_unavailable_offline") ? "TRACK_UNAVAILABLE_OFFLINE" : "UNKNOWN";
    }

    /* JADX INFO: renamed from: f */
    public final Observable m24583f() {
        return this.f11791h.m23339T(this.f11796m.m43222c(4).m23306x()).m23327A().toObservable().map(new y201(this, 6));
    }

    /* JADX INFO: renamed from: g */
    public final Single m24584g(String str, PreparePlayOptions preparePlayOptions, String str2) {
        return this.f11794k.m63218d(this.f11809z, str, null, null, 1).map(new xwz0(15)).flatMap(new geq(this, str, preparePlayOptions, str2, 3)).map(new two("Cannot play specified uri", 17));
    }

    /* JADX INFO: renamed from: h */
    public final Observable m24585h(AppProtocol$Uri appProtocol$Uri) {
        return m24584g(appProtocol$Uri.uri, null, appProtocol$Uri.featureIdentifier).toObservable().startWith(this.f11796m.m43222c(2).m23307y());
    }

    /* JADX INFO: renamed from: i */
    public final Observable m24586i(AppProtocol$UriWithOptionExtras appProtocol$UriWithOptionExtras) {
        String str = appProtocol$UriWithOptionExtras.uri;
        List list = appProtocol$UriWithOptionExtras.options;
        return Single.create(new k9w0(13, (String[]) list.toArray(new String[list.size()]), str)).flatMap(new jt4(this, str, appProtocol$UriWithOptionExtras.featureIdentifier, 27)).toObservable().startWith(this.f11796m.m43222c(2).m23307y());
    }

    /* JADX INFO: renamed from: j */
    public final Observable m24587j(int i) {
        c0y c0yVar = (c0y) this.f11805v;
        Completable completableM23301r = ((m241) c0yVar.f32914k.getValue()).mo32086c(c0yVar.f32912i, i).m23296h(faq.f67602X0).m23301r(this.f11796m.m43222c(2));
        Completable completableIgnoreElements = this.f11786c.f235651a.f246566f.m43244a().firstOrError().toObservable().flatMap(new xwz0(28)).ignoreElements();
        completableM23301r.getClass();
        Objects.requireNonNull(completableIgnoreElements, "other is null");
        CompletableAndThenCompletable completableAndThenCompletable = new CompletableAndThenCompletable(completableM23301r, completableIgnoreElements);
        Completable completableIgnoreElements2 = m24583f().firstOrError().toObservable().flatMap(new z201(11)).ignoreElements();
        Objects.requireNonNull(completableIgnoreElements2, "other is null");
        return new CompletableAndThenCompletable(completableAndThenCompletable, completableIgnoreElements2).m23307y().concatWith(Observable.just(AbstractC0800a.f4604a)).map(new xwz0(4)).timeout(25L, TimeUnit.SECONDS, Observable.error(new TimeoutException())).onErrorResumeNext(new xwz0(5));
    }

    /* JADX INFO: renamed from: k */
    public final Observable m24588k(AppProtocol$Repeat appProtocol$Repeat) {
        return Single.just(appProtocol$Repeat.repeat).flatMap(new y201(this, 0)).map(new two("Could not set repeat mode", 17)).toObservable().startWith(this.f11796m.m43222c(1).m23307y());
    }

    /* JADX INFO: renamed from: l */
    public final Observable m24589l(AppProtocol$Shuffle appProtocol$Shuffle) {
        Observable observable = this.f11791h.m23339T(this.f11796m.m43222c(1).m23306x()).m23327A().flatMap(new k9w0(14, this, appProtocol$Shuffle)).map(new two("Could not update shuffle", 17)).toObservable();
        ExternalAccessoryDescription externalAccessoryDescription = this.f11809z;
        boolean zBooleanValue = appProtocol$Shuffle.shuffle.booleanValue();
        myx myxVar = this.f11794k;
        return observable.startWith((zBooleanValue ? myxVar.m63225l(externalAccessoryDescription, 1, 2) : myxVar.m63225l(externalAccessoryDescription, 2, 1)).ignoreElement().m23307y());
    }

    /* JADX INFO: renamed from: m */
    public final int m24590m(int i, String str) {
        int iIncrementAndGet;
        CompletableFromAction completableFromAction = new CompletableFromAction(new oy30(this.f11796m, 4));
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        completableFromAction.subscribe(blockingMultiObserver);
        blockingMultiObserver.m23463b();
        t46.m80054z(0, Alert.DURATION_SHOW_INDEFINITELY, i, "request id");
        t46.m80052x(str, "uri");
        c19 c19VarM96979j = this.f11801r.m96979j(str);
        if (c19VarM96979j == null) {
            Logger.m3973i("Attempted to subscribe to unknown topic \"%s\".", str);
            return 0;
        }
        synchronized (c19VarM96979j) {
            iIncrementAndGet = c19.f33021d.incrementAndGet();
            c19VarM96979j.f33023a.add(Integer.valueOf(iIncrementAndGet));
        }
        return iIncrementAndGet;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m24591n(int i, int i2) throws FieldValidator$ValidationException {
        c19 c19Var;
        t46.m80054z(0, Alert.DURATION_SHOW_INDEFINITELY, i, "request id");
        t46.m80054z(Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY, i2, "subscription id");
        Iterator it = ((HashMap) this.f11801r.f286301d).values().iterator();
        do {
            if (!it.hasNext()) {
                c19Var = null;
                break;
            }
            c19Var = (c19) it.next();
        } while (!c19Var.f33023a.contains(Integer.valueOf(i2)));
        if (c19Var == null) {
            return false;
        }
        c19Var.f33023a.remove(Integer.valueOf(i2));
        return true;
    }
}
