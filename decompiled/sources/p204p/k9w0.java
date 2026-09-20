package p204p;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.RemoteException;
import android.view.Surface;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.serialization.BundlerException;
import androidx.media3.transformer.ExportException;
import androidx.work.WorkerParameters;
import androidx.work.rxjava3.RxWorker;
import com.google.android.gms.tasks.Task;
import com.spotify.betamax.transcoder.BetamaxTranscoderException;
import com.spotify.interapp.model.AbstractC0800a;
import com.spotify.interapp.model.AppProtocol$Identifier;
import com.spotify.interapp.model.AppProtocol$Message;
import com.spotify.interapp.model.AppProtocol$Saved;
import com.spotify.interapp.model.AppProtocol$Shuffle;
import com.spotify.interapp.model.AppProtocol$SkipPrevious;
import com.spotify.interapp.model.AppProtocol$Uri;
import com.spotify.interapp.model.AppProtocol$UriWithNamedOptions;
import com.spotify.interapp.service.IapException;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.command.SetShufflingContextCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.schedulers.ExecutorScheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k9w0 implements hbb, tew0, gbk, azx0, mb40, ObservableOnSubscribe, Function, SingleOnSubscribe, v8j, k890, pg61 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f120716a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f120717b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f120718c;

    public /* synthetic */ k9w0(int i, Object obj, Object obj2) {
        this.f120716a = i;
        this.f120717b = obj;
        this.f120718c = obj2;
    }

    @Override // p204p.pg61
    /* JADX INFO: renamed from: a */
    public Object mo36422a() {
        switch (this.f120716a) {
            case 20:
                rvw0 rvw0Var = (rvw0) this.f120717b;
                Iterable iterable = (Iterable) this.f120718c;
                czx0 czx0Var = (czx0) ((w8x) rvw0Var.f203141c);
                czx0Var.getClass();
                if (iterable.iterator().hasNext()) {
                    czx0Var.m34471a().compileStatement("DELETE FROM events WHERE _id in " + czx0.m34469i(iterable)).execute();
                    break;
                }
                break;
            default:
                rvw0 rvw0Var2 = (rvw0) this.f120717b;
                for (Map.Entry entry : ((HashMap) this.f120718c).entrySet()) {
                    ((czx0) ((zje) rvw0Var2.f203147i)).m34474g(((Integer) entry.getValue()).intValue(), upa0.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // p204p.v8j
    public void accept(Object obj) {
        qv51 qv51Var = (qv51) this.f120717b;
        AtomicLong atomicLong = (AtomicLong) this.f120718c;
        z0m z0mVar = (z0m) obj;
        pv51 pv51Var = new pv51(z0mVar.f278137b, er3.m39754i(z0mVar.f278136a, z0mVar.f278138c));
        qv51Var.f192906c.add(pv51Var);
        long j = z0mVar.f278139d;
        if (j != -9223372036854775807L) {
            atomicLong.set(atomicLong.get() == -9223372036854775807L ? j : Math.max(atomicLong.get(), j));
        }
        long j2 = qv51Var.f192915l;
        if (j2 == -9223372036854775807L || j >= j2) {
            qv51Var.m73975f(pv51Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0247  */
    /* JADX WARN: Code duplicated, block: B:76:0x0259  */
    /* JADX WARN: Code duplicated, block: B:81:0x0284 A[Catch: all -> 0x030c, TryCatch #0 {all -> 0x030c, blocks: (B:79:0x027e, B:81:0x0284, B:83:0x0294, B:84:0x02a0), top: B:101:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0294 A[Catch: all -> 0x030c, TryCatch #0 {all -> 0x030c, blocks: (B:79:0x027e, B:81:0x0284, B:83:0x0294, B:84:0x02a0), top: B:101:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:89:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:95:0x02ee A[LOOP:4: B:93:0x02e8->B:95:0x02ee, LOOP_END] */
    @Override // p204p.azx0
    public Object apply(Object obj) {
        HashMap map;
        StringBuilder sb;
        int i;
        Cursor cursorQuery;
        ListIterator listIterator;
        r18 r18Var;
        long j;
        long j2;
        rk0 rk0VarM79773c;
        long j3;
        Set hashSet;
        switch (this.f120716a) {
            case 4:
                czx0 czx0Var = (czx0) this.f120717b;
                t28 t28Var = (t28) this.f120718c;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                u08 u08Var = czx0Var.f43656d;
                ArrayList arrayListM34473f = czx0Var.m34473f(sQLiteDatabase, t28Var, u08Var.f225405b);
                for (ler0 ler0Var : ler0.values()) {
                    if (ler0Var != t28Var.f216449c) {
                        int size = u08Var.f225405b - arrayListM34473f.size();
                        if (size <= 0) {
                            map = new HashMap();
                            sb = new StringBuilder("event_id IN (");
                            for (i = 0; i < arrayListM34473f.size(); i++) {
                                sb.append(((r18) arrayListM34473f.get(i)).f194797a);
                                if (i < arrayListM34473f.size() - 1) {
                                    sb.append(',');
                                }
                            }
                            sb.append(')');
                            cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                            while (cursorQuery.moveToNext()) {
                                try {
                                    j3 = cursorQuery.getLong(0);
                                    hashSet = (Set) map.get(Long.valueOf(j3));
                                    if (hashSet == null) {
                                        hashSet = new HashSet();
                                        map.put(Long.valueOf(j3), hashSet);
                                    }
                                    hashSet.add(new bzx0(cursorQuery.getString(1), cursorQuery.getString(2)));
                                } catch (Throwable th) {
                                    cursorQuery.close();
                                    throw th;
                                }
                                break;
                            }
                            cursorQuery.close();
                            listIterator = arrayListM34473f.listIterator();
                            while (listIterator.hasNext()) {
                                r18Var = (r18) listIterator.next();
                                j = r18Var.f194797a;
                                j2 = r18Var.f194797a;
                                if (!map.containsKey(Long.valueOf(j))) {
                                    rk0VarM79773c = r18Var.f194799c.m79773c();
                                    for (bzx0 bzx0Var : (Set) map.get(Long.valueOf(j2))) {
                                        rk0VarM79773c.m75706v(bzx0Var.f32613a, bzx0Var.f32614b);
                                    }
                                    listIterator.set(new r18(j2, r18Var.f194798b, rk0VarM79773c.m75710z()));
                                }
                            }
                            return arrayListM34473f;
                        }
                        arrayListM34473f.addAll(czx0Var.m34473f(sQLiteDatabase, t28Var.m79892b(ler0Var), size));
                    }
                }
                map = new HashMap();
                sb = new StringBuilder("event_id IN (");
                while (i < arrayListM34473f.size()) {
                    sb.append(((r18) arrayListM34473f.get(i)).f194797a);
                    if (i < arrayListM34473f.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    j3 = cursorQuery.getLong(0);
                    hashSet = (Set) map.get(Long.valueOf(j3));
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(Long.valueOf(j3), hashSet);
                    }
                    hashSet.add(new bzx0(cursorQuery.getString(1), cursorQuery.getString(2)));
                    break;
                }
                cursorQuery.close();
                listIterator = arrayListM34473f.listIterator();
                while (listIterator.hasNext()) {
                    r18Var = (r18) listIterator.next();
                    j = r18Var.f194797a;
                    j2 = r18Var.f194797a;
                    if (!map.containsKey(Long.valueOf(j))) {
                        rk0VarM79773c = r18Var.f194799c.m79773c();
                        while (r3.hasNext()) {
                            rk0VarM79773c.m75706v(bzx0Var.f32613a, bzx0Var.f32614b);
                        }
                        listIterator.set(new r18(j2, r18Var.f194798b, rk0VarM79773c.m75710z()));
                    }
                }
                return arrayListM34473f;
            case 5:
            case 6:
            case 7:
            default:
                a301 a301Var = (a301) this.f120717b;
                AppProtocol$Shuffle appProtocol$Shuffle = (AppProtocol$Shuffle) this.f120718c;
                Restrictions restrictions = ((PlayerState) obj).restrictions();
                if (!restrictions.disallowTogglingShuffleReasons().isEmpty()) {
                    throw new IapException(new AppProtocol$Message(s571.m77251j("Cannot set shuffle: [", a301.m24582e(restrictions.disallowTogglingShuffleReasons()), "]")), "wamp.error");
                }
                return ((c0y) a301Var.f11805v).f32912i.m51475d(SetShufflingContextCommand.create(appProtocol$Shuffle.shuffle.booleanValue()));
            case 8:
                a301 a301Var2 = (a301) this.f120717b;
                AppProtocol$SkipPrevious appProtocol$SkipPrevious = (AppProtocol$SkipPrevious) this.f120718c;
                qqm0 qqm0Var = (qqm0) obj;
                a301Var2.getClass();
                PlayerState playerState = (PlayerState) qqm0Var.f191621b;
                xul0 xul0Var = (xul0) qqm0Var.f191620a;
                boolean z = appProtocol$SkipPrevious == null || !appProtocol$SkipPrevious.forceSkipPrevious.booleanValue();
                return (z || playerState.restrictions().disallowSkippingPrevReasons().isEmpty()) ? ((c0y) a301Var2.f11805v).m31198g(xul0Var, z) : ((c0y) a301Var2.f11805v).m31201j(0L, xul0Var);
            case 9:
                uzx uzxVar = ((a301) this.f120717b).f11786c;
                AppProtocol$Saved appProtocol$Saved = (AppProtocol$Saved) this.f120718c;
                PlayerState playerState2 = (PlayerState) obj;
                String str = appProtocol$Saved.uri;
                Boolean bool = appProtocol$Saved.saved;
                String str2 = appProtocol$Saved.id;
                if ((str != null && playerState2.track().mo49279c() && str.equals(((ContextTrack) playerState2.track().mo49278b()).uri()) && "true".equals(playerState2.contextMetadata().get(Context.Metadata.KEY_IS_AUDIOBOOK))) || (str == null && "true".equals(playerState2.contextMetadata().get(Context.Metadata.KEY_IS_AUDIOBOOK)))) {
                    return CompletableEmpty.f7437a;
                }
                playerState2.contextUri();
                if (str != null || str2 != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    String str3 = (String) vie1.m85630l(str, str2);
                    return zBooleanValue ? uzxVar.f235651a.f246567g.m40431a(str3) : uzxVar.f235651a.f246567g.m40433c(str3);
                }
                ContextTrack contextTrack = (ContextTrack) playerState2.track().mo49283h();
                if (contextTrack == null) {
                    na6.m63965m("Track is null");
                    return CompletableEmpty.f7437a;
                }
                String strUri = contextTrack.uri();
                return bool.booleanValue() ? uzxVar.f235651a.f246567g.m40431a(strUri) : uzxVar.f235651a.f246567g.m40433c(strUri);
            case 10:
                a301 a301Var3 = (a301) this.f120717b;
                String str4 = (String) obj;
                return a301Var3.f11794k.m63218d(a301Var3.f11809z, str4, null, null, 1).map(new xwz0(29)).flatMap(new jt4(a301Var3, str4, (AppProtocol$Identifier) this.f120718c, 28)).map(new two("Couldn't start radio", 17)).toObservable();
            case 11:
                a301 a301Var4 = (a301) this.f120717b;
                AppProtocol$Uri appProtocol$Uri = (AppProtocol$Uri) this.f120718c;
                Restrictions restrictions2 = ((PlayerState) obj).restrictions();
                if (!restrictions2.disallowInsertingIntoNextTracksReasons().isEmpty()) {
                    throw new IapException(new AppProtocol$Message(s571.m77251j("Cannot queue specified uri: [", a301.m24582e(restrictions2.disallowInsertingIntoNextTracksReasons()), "]")), "wamp.error");
                }
                f0y f0yVar = (f0y) a301Var4.f11786c.f235651a.f246570j;
                f0yVar.f64741a.m60127a(f0yVar.f64742b.m54195a(ContextTrack.create(appProtocol$Uri.uri)).subscribe(new ntb(5), new ntb(6)));
                return AbstractC0800a.f4604a;
            case 12:
                a301 a301Var5 = (a301) this.f120717b;
                AppProtocol$UriWithNamedOptions appProtocol$UriWithNamedOptions = (AppProtocol$UriWithNamedOptions) this.f120718c;
                a301Var5.getClass();
                return a301Var5.m24584g(appProtocol$UriWithNamedOptions.uri, (PreparePlayOptions) obj, appProtocol$UriWithNamedOptions.featureIdentifier);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [p.eh00, p.qe70] */
    @Override // p204p.hbb
    public Object attachCompleter(gbb gbbVar) {
        int i = this.f120716a;
        w2a1 w2a1Var = w2a1.f247311a;
        int i2 = 0;
        Object obj = this.f120718c;
        Object obj2 = this.f120717b;
        switch (i) {
            case 0:
                vyr0 vyr0Var = (vyr0) obj2;
                Intent intent = (Intent) obj;
                vyr0.m86841i(intent);
                w4f1 w4f1Var = (w4f1) vyr0Var.f246315d;
                aaq0 aaq0Var = new aaq0(23, vyr0Var, gbbVar);
                ExecutorService executorService = (ExecutorService) vyr0Var.f246314c;
                android.content.Context context = (android.content.Context) vyr0Var.f246313b;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    context.sendBroadcast(vyr0.m86842n(intent, new m9w0(gbbVar, 1), null, "com.google.android.wearable.app"));
                } else {
                    y7h1 y7h1VarM87193h = w4f1Var.m87193h();
                    y7h1VarM87193h.mo1512d(executorService, new nrs0(new ca4(aaq0Var, gbbVar, w4f1Var, vyr0Var, intent, 2), 25));
                    y7h1VarM87193h.mo1511c(executorService, new l9w0(aaq0Var, i2));
                }
                return w2a1Var;
            case 3:
                WorkerParameters workerParameters = ((RxWorker) obj2).f66917b;
                ExecutorService executorService2 = workerParameters.f1406d;
                Scheduler scheduler = Schedulers.f10368a;
                ((Single) obj).subscribeOn(new ExecutorScheduler(executorService2, true, true)).observeOn(new ExecutorScheduler(workerParameters.f1408f.f160371a, true, true)).subscribe(new kyx0(gbbVar));
                return "converted single to future";
            case 16:
                ((AtomicReference) obj).set(gbbVar);
                return "SurfaceRequest-surface-recreation(" + ((s861) obj2).hashCode() + ")";
            case 18:
                bg71 bg71Var = (bg71) obj2;
                Surface surface = (Surface) obj;
                vie1.m85624f("TextureViewImpl");
                bg71Var.f26866h.m77462a(surface, e95.m38202g(), new awb(gbbVar, 3));
                return "provideSurface[request=" + bg71Var.f26866h + " surface=" + surface + "]";
            default:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                gbbVar.m44210a(new v790(atomicBoolean, 1), bkr.f28006a);
                ((Executor) obj2).execute(new kgd0(atomicBoolean, gbbVar, (eh00) obj));
                return w2a1Var;
        }
    }

    @Override // p204p.gbk
    /* JADX INFO: renamed from: b */
    public Object mo25397b(Task task) {
        u4l0 u4l0Var = (u4l0) this.f120717b;
        String str = (String) this.f120718c;
        synchronized (u4l0Var) {
            ((uj5) u4l0Var.f226773c).remove(str);
        }
        return task;
    }

    /* JADX INFO: renamed from: c */
    public p4l0 m55850c(si5 si5Var) {
        rb71 rb71Var = (rb71) this.f120717b;
        i15 i15Var = (i15) this.f120718c;
        db71 db71Var = (db71) rb71Var.f197520a.getValue();
        int i = 0;
        if (db71Var == null) {
            return new p4l0(i, i, new saa0(22), 12);
        }
        i15 i15VarM75165c = rb71.m75165c(i15Var, db71Var);
        if (i15VarM75165c == null) {
            return new p4l0(i, i, new saa0(23), 12);
        }
        c450 c450VarM92059F = xtm0.m92059F(db71Var.m35540k(i15VarM75165c.f97389b, i15VarM75165c.f97390c).m83303h());
        return new p4l0(c450VarM92059F.m31426d(), c450VarM92059F.m31424b(), new u471(c450VarM92059F, 5), 12);
    }

    @Override // p204p.tew0
    public Object call() {
        try {
            ((IOnDoneCallback) this.f120717b).onFailure(new pra(new FailureResponse((Exception) this.f120718c)));
            return null;
        } catch (BundlerException unused) {
            return null;
        }
    }

    @Override // p204p.mb40
    /* JADX INFO: renamed from: i */
    public void mo55851i(nb40 nb40Var) {
        xvb xvbVar = (xvb) this.f120717b;
        mb40 mb40Var = (mb40) this.f120718c;
        xvbVar.getClass();
        mb40Var.mo55851i(xvbVar);
    }

    @Override // p204p.k890
    public void invoke(Object obj) {
        d501 d501Var = (d501) this.f120717b;
        ExportException exportException = (ExportException) this.f120718c;
        ci50 ci50Var = (ci50) obj;
        fsh fshVar = ((a691) d501Var.f45295b).f12744u;
        fshVar.getClass();
        ci50Var.getClass();
        if (ci50Var.f38228c.compareAndSet(false, true)) {
            ci50Var.f38227b.invoke(0L, new BetamaxTranscoderException("Transcoding error occurred with composition: " + fshVar, exportException, null, 4));
        }
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        switch (this.f120716a) {
            case 6:
                fus0 fus0Var = (fus0) this.f120717b;
                android.content.Context context = (android.content.Context) this.f120718c;
                mr6 mr6Var = new mr6(fus0Var, observableEmitter);
                fus0Var.f73566b = new hzq0(new feb(fus0Var, context, observableEmitter, mr6Var, 20));
                android.content.Context applicationContext = context.getApplicationContext();
                Intent intent = new Intent("com.msc.action.samsungaccount.REQUEST_SERVICE");
                intent.setPackage("com.osp.app.signin");
                if (!applicationContext.bindService(intent, mr6Var, 1)) {
                    observableEmitter.tryOnError(new Exception("Couldn't bind service!"));
                }
                break;
            default:
                l3y0 l3y0Var = (l3y0) this.f120717b;
                cy30 cy30Var = (cy30) this.f120718c;
                try {
                    l3y0Var.f129460c = xul0.m92201d(((ay30) cy30Var).m27498C(l3y0Var.f129458a.getPackageName(), new k3y0(l3y0Var, cy30Var, observableEmitter)));
                    if (!l3y0Var.m58032b(cy30Var) && !observableEmitter.isDisposed()) {
                        observableEmitter.onNext(new h2y0("Request auth code failed!"));
                        observableEmitter.onComplete();
                        break;
                    }
                } catch (RemoteException unused) {
                    if (observableEmitter.isDisposed()) {
                        return;
                    }
                    observableEmitter.onNext(new h2y0("Failure with Service binding"));
                    observableEmitter.onComplete();
                }
                break;
        }
    }

    public /* synthetic */ k9w0(IOnDoneCallback iOnDoneCallback, Exception exc, String str) {
        this.f120716a = 1;
        this.f120717b = iOnDoneCallback;
        this.f120718c = exc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k9w0(Executor executor, eh00 eh00Var) {
        this.f120716a = 22;
        this.f120717b = executor;
        this.f120718c = (qe70) eh00Var;
    }

    public /* synthetic */ k9w0(d501 d501Var, onx onxVar, ExportException exportException) {
        this.f120716a = 19;
        this.f120717b = d501Var;
        this.f120718c = exportException;
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        String[] strArr = (String[]) this.f120717b;
        String str = (String) this.f120718c;
        PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
        try {
            HashMap mapM41243k = fbg1.m41243k(strArr);
            tul0 tul0Var = tul0.STREAMTYPE;
            if (mapM41243k.containsKey(tul0Var)) {
                if (rul0.f202872a == ((rul0) mapM41243k.get(tul0Var))) {
                    builder.audioStream(AudioStream.ALARM);
                }
            }
            a301.m24579b(str, mapM41243k, builder);
            singleEmitter.onSuccess(builder.build());
        } catch (Exception e) {
            singleEmitter.onError(new IapException(e.getMessage(), "wamp.error"));
        }
    }
}
