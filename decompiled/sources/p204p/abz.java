package p204p;

import android.adservices.measurement.MeasurementManager;
import android.media.UnsupportedSchemeException;
import android.os.Bundle;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abz implements k5x, f5y, hix, gbk, ak30, lk30, os30, ys30, qz30, egy, ej11, Function, hbb, v8j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14206a;

    public /* synthetic */ abz(int i) {
        this.f14206a = i;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ MeasurementManager m25393m(Object obj) {
        return (MeasurementManager) obj;
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ Class m25395o() {
        return MeasurementManager.class;
    }

    @Override // p204p.v8j
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f14206a) {
            case 25:
                return CompletableEmpty.f7437a;
            case 26:
                return ((s431) obj).f205429b;
            default:
                return CompletableEmpty.f7437a;
        }
    }

    @Override // p204p.hbb
    public Object attachCompleter(gbb gbbVar) {
        gbbVar.m44212c(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    @Override // p204p.gbk
    /* JADX INFO: renamed from: b */
    public Object mo25397b(Task task) throws IOException {
        Bundle bundle = (Bundle) task.mo1516h(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        bundle.toString();
        new Throwable();
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override // p204p.ys30
    /* JADX INFO: renamed from: c */
    public fk30 mo25398c(fk30 fk30Var) {
        return fk30Var;
    }

    @Override // p204p.qz30
    /* JADX INFO: renamed from: d */
    public boolean mo25399d(int i, int i2, int i3, int i4, int i5) {
        switch (this.f14206a) {
            case 16:
                return false;
            default:
                return i != 2 ? !(i2 == 65 && i3 == 80 && i4 == 73 && i5 == 67) : !(i2 == 80 && i3 == 73 && i4 == 67);
        }
    }

    @Override // p204p.ak30
    /* JADX INFO: renamed from: e */
    public void mo25400e(zj30 zj30Var) {
    }

    @Override // p204p.ej11
    /* JADX INFO: renamed from: f */
    public boolean mo25401f() {
        return false;
    }

    @Override // p204p.f5y
    /* JADX INFO: renamed from: g */
    public c5y[] mo25402g() {
        switch (this.f14206a) {
            case 2:
                return new c5y[]{new sez()};
            default:
                return new c5y[]{new onz()};
        }
    }

    /* JADX INFO: renamed from: h */
    public Object m25403h(Object obj, Object obj2) {
        l3n l3nVar = (l3n) obj;
        switch (this.f14206a) {
            case 22:
                cu50 cu50Var = (cu50) obj2;
                l3nVar.getClass();
                cu50Var.getClass();
                return new os60((p2n) ((h4t0) new t7j(cu50Var).f217840c).get());
            default:
                l3nVar.getClass();
                ((tvp0) obj2).getClass();
                return new be80(l3nVar.f129350b, 0);
        }
    }

    @Override // p204p.egy
    /* JADX INFO: renamed from: i */
    public void mo25404i(boolean z) {
        File[] fileArrListFiles;
        int i = 0;
        int i2 = 1;
        switch (this.f14206a) {
            case 19:
                if (z) {
                    synchronized (c0l.f32815c) {
                        try {
                            p8y p8yVar = p8y.f175080a;
                            if (dwa1.m37142c()) {
                                t46.m80048t();
                            }
                            if (c0l.f32816d == null) {
                                c0l c0lVar = new c0l(Thread.getDefaultUncaughtExceptionHandler(), i);
                                c0l.f32816d = c0lVar;
                                Thread.setDefaultUncaughtExceptionHandler(c0lVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (hgy.m47481b(fgy.CrashShield)) {
                        m2h1.f139351b = true;
                        if (dwa1.m37142c() && !n0b1.m63382v()) {
                            File fileM57621p = kxf1.m57621p();
                            if (fileM57621p == null) {
                                fileArrListFiles = new File[0];
                            } else {
                                fileArrListFiles = fileM57621p.listFiles(new l4l(4));
                                if (fileArrListFiles == null) {
                                    fileArrListFiles = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                r150 r150VarM37221J = dxf1.m37221J(file);
                                if (r150VarM37221J.m74455a()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", r150VarM37221J.toString());
                                        String str = dx10.f53819j;
                                        arrayList.add(hvi0.m48883s(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{p8y.m69344b()}, 1)), jSONObject, new C2289qd(r150VarM37221J, 2)));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                fx10 fx10Var = new fx10(arrayList);
                                String str2 = dx10.f53819j;
                                zn91.m96546d0(fx10Var);
                                new ex10(fx10Var).executeOnExecutor(p8y.m69345c(), new Void[0]);
                            }
                        }
                        p2l.f173366b = true;
                    }
                    hgy.m47481b(fgy.ThreadCheck);
                    return;
                }
                return;
            case 20:
                if (z) {
                    p8y p8yVar2 = p8y.f175080a;
                    if (!dwa1.m37142c() || n0b1.m63382v()) {
                        return;
                    }
                    File fileM57621p2 = kxf1.m57621p();
                    File[] fileArrListFiles2 = fileM57621p2 == null ? new File[0] : fileM57621p2.listFiles(new l4l(1));
                    ArrayList arrayList2 = new ArrayList();
                    for (File file2 : fileArrListFiles2) {
                        cgw cgwVar = new cgw();
                        String name = file2.getName();
                        cgwVar.f37817a = name;
                        JSONObject jSONObjectM57629x = kxf1.m57629x(name);
                        if (jSONObjectM57629x != null) {
                            cgwVar.f37819c = Long.valueOf(jSONObjectM57629x.optLong("timestamp", 0L));
                            cgwVar.f37818b = jSONObjectM57629x.optString("error_message", null);
                        }
                        if (cgwVar.f37818b != null && cgwVar.f37819c != null) {
                            arrayList2.add(cgwVar);
                        }
                    }
                    j6f.m52572d0(arrayList2, new C2109m(15));
                    JSONArray jSONArray = new JSONArray();
                    while (i < arrayList2.size() && i < 1000) {
                        jSONArray.put(arrayList2.get(i));
                        i++;
                    }
                    kxf1.m57630y("error_reports", jSONArray, new C2289qd(arrayList2, i2));
                    return;
                }
                return;
            default:
                if (z) {
                    AtomicBoolean atomicBoolean = AbstractC2196o.f160191a;
                    synchronized (AbstractC2196o.class) {
                        Set set = p2l.f173365a;
                        if (set.contains(AbstractC2196o.class)) {
                            return;
                        }
                        try {
                            if (AbstractC2196o.f160191a.getAndSet(true)) {
                                return;
                            }
                            p8y p8yVar3 = p8y.f175080a;
                            if (dwa1.m37142c()) {
                                AbstractC2196o.m65969a();
                            }
                            int i3 = AbstractC2072l.f128241a;
                            if (!set.contains(AbstractC2072l.class)) {
                                try {
                                    AbstractC2072l.f128242b.scheduleWithFixedDelay(AbstractC2072l.f128244d, 0L, 500L, TimeUnit.MILLISECONDS);
                                } catch (Throwable th2) {
                                    p2l.m68953a(AbstractC2072l.class, th2);
                                }
                            }
                            break;
                        } catch (Throwable th3) {
                            p2l.m68953a(AbstractC2196o.class, th3);
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override // p204p.os30
    /* JADX INFO: renamed from: j */
    public void mo25405j(it30 it30Var) {
    }

    @Override // p204p.lk30
    /* JADX INFO: renamed from: k */
    public int mo25406k(fk30 fk30Var) {
        return kk30.lambda$static$0(fk30Var);
    }

    @Override // p204p.hix
    /* JADX INFO: renamed from: l */
    public jix mo25407l(UUID uuid) {
        try {
            try {
                return new v900(uuid);
            } catch (UnsupportedDrmException unused) {
                yif1.m93808r("Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                return new sp5(9);
            }
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(e2);
        }
    }

    public /* synthetic */ abz(Object obj, int i) {
        this.f14206a = i;
    }
}
