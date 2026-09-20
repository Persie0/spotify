package p204p;

import com.spotify.interapp.model.AppProtocol$ImageIdentifier;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class fzj {

    /* JADX INFO: renamed from: a */
    public Object f75030a;

    /* JADX INFO: renamed from: b */
    public volatile Object f75031b;

    public fzj(int i) {
        switch (i) {
            case 3:
                this.f75031b = UUID.randomUUID();
                this.f75030a = new ConcurrentHashMap();
                break;
            default:
                this.f75030a = new CopyOnWriteArraySet();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m43220a(w7l0 w7l0Var) {
        if (((cwf) this.f75031b) != null) {
            w7l0Var.mo55415a();
        }
        ((CopyOnWriteArraySet) this.f75030a).add(w7l0Var);
    }

    /* JADX INFO: renamed from: b */
    public Completable m43221b(int i, AppProtocol$ImageIdentifier appProtocol$ImageIdentifier) {
        return Completable.m23285f(m43222c(i), new CompletableFromAction(new vv2(appProtocol$ImageIdentifier, 6)), new CompletableFromAction(new vv2(appProtocol$ImageIdentifier, 5)));
    }

    /* JADX INFO: renamed from: c */
    public Completable m43222c(int i) {
        return Completable.m23285f(new CompletableFromAction(new vv2(this, 7)), new CompletableFromAction(new oy30(this, i)));
    }

    /* JADX INFO: renamed from: d */
    public void m43223d() {
        this.f75031b = null;
    }

    /* JADX INFO: renamed from: e */
    public void m43224e(cwf cwfVar) {
        this.f75031b = cwfVar;
        Iterator it = ((CopyOnWriteArraySet) this.f75030a).iterator();
        while (it.hasNext()) {
            ((w7l0) it.next()).mo55415a();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m43225f(String str, double d) {
        if (d <= 0.0d) {
            return false;
        }
        if (d >= 1.0d) {
            return true;
        }
        UUID uuid = (UUID) this.f75031b;
        StringBuilder sb = new StringBuilder();
        sb.append(uuid);
        sb.append(":");
        sb.append(str);
        return wj50.m88268h0(ByteBuffer.wrap(MessageDigest.getInstance("SHA-256").digest(sb.toString().getBytes(vuc.f244913a)), 0, 8).getLong()) / 1.8446744073709552E19d < d;
    }

    /* JADX INFO: renamed from: g */
    public i890 m43226g() {
        return (i890) this.f75031b;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [p.gh00, p.ri00] */
    /* JADX INFO: renamed from: h */
    public boolean m43227h(hnk0 hnk0Var) {
        boolean zM43225f;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f75030a;
        String strM48011a = hnk0Var.m48011a();
        Object obj = concurrentHashMap.get(strM48011a);
        if (obj == null) {
            v1y0 v1y0Var = hnk0Var.f93357c;
            if (v1y0Var instanceof s1y0) {
                zM43225f = true;
            } else if (v1y0Var instanceof u1y0) {
                zM43225f = m43225f(hnk0Var.m48011a(), ((u1y0) v1y0Var).f225936a);
            } else {
                if (!(v1y0Var instanceof t1y0)) {
                    throw new NoWhenBranchMatchedException();
                }
                zM43225f = m43225f(hnk0Var.m48011a(), ((Number) ((t1y0) v1y0Var).f216381a.invoke(hnk0Var)).doubleValue());
            }
            Boolean boolValueOf = Boolean.valueOf(zM43225f);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(strM48011a, boolValueOf);
            obj = objPutIfAbsent == null ? boolValueOf : objPutIfAbsent;
        }
        return ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public void m43228i(j890 j890Var) {
        ((zr20) this.f75030a).execute(new wpa1(8, this, j890Var));
    }
}
