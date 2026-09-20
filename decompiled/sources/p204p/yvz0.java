package p204p;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class yvz0 {

    /* JADX INFO: renamed from: f */
    public static yvz0 f276793f;

    /* JADX INFO: renamed from: g */
    public static final Object f276794g = new Object();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f276795a;

    /* JADX INFO: renamed from: b */
    public int f276796b;

    /* JADX INFO: renamed from: c */
    public final Object f276797c;

    /* JADX INFO: renamed from: d */
    public Serializable f276798d;

    /* JADX INFO: renamed from: e */
    public Serializable f276799e;

    public yvz0(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f276795a = 2;
        this.f276796b = i;
        this.f276799e = str;
        this.f276797c = arrayList;
        this.f276798d = arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static void m94754b(CountDownLatch countDownLatch, int i, xvz0 xvz0Var) {
        uvz0 uvz0Var = xvz0Var.f266544a;
        try {
            if (countDownLatch.await(i, TimeUnit.MILLISECONDS)) {
                return;
            }
            xvz0Var.cancel(true);
            int i2 = uvz0Var.f234528d;
            xvz0Var.m92273b(new bwz0(-120, "Thread task timed out. Timeout: " + i));
        } catch (InterruptedException e) {
            syg1.m79689h("Caught InterruptedException " + e.getMessage());
            xvz0Var.cancel(true);
            int i3 = uvz0Var.f234528d;
            xvz0Var.m92273b(new bwz0(-120, e.getMessage()));
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m94755h() {
        return !wia.m88198i().f251586b.m87774E().equals("bnc_no_value");
    }

    /* JADX INFO: renamed from: a */
    public void m94756a(String str, String str2) {
        ((ConcurrentHashMap) this.f276799e).put(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public void m94757c() {
        synchronized (f276794g) {
            try {
                syg1.m79703v("Queue operation clear: " + ((List) this.f276797c));
                ((List) this.f276797c).clear();
                syg1.m79703v("Queue cleared.");
            } catch (UnsupportedOperationException e) {
                syg1.m79689h("Caught UnsupportedOperationException " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m94758d(uvz0 uvz0Var, int i) {
        syg1.m79703v("executeTimedBranchPostTask " + uvz0Var);
        if (uvz0Var instanceof vvz0) {
            syg1.m79703v("callback to be returned " + ((vvz0) uvz0Var).f245364i);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        xvz0 xvz0Var = new xvz0(this, uvz0Var, countDownLatch);
        xvz0Var.m93702a(new Void[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Thread(new wvz0(this, countDownLatch, i, xvz0Var)).start();
        } else {
            m94754b(countDownLatch, i, xvz0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public String m94759e() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f276796b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.f276798d)[i2];
            if (obj instanceof ktz0) {
                ktz0 ktz0Var = (ktz0) obj;
                if (!wj50.m88271j(ktz0Var.getKind(), in51.f103871A0)) {
                    int i3 = ((int[]) this.f276799e)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(ktz0Var.mo33223f(i3));
                    }
                } else if (((int[]) this.f276799e)[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f276799e)[i2]);
                    sb.append("]");
                }
            } else if (obj == y8z.f270445h) {
                sb.append("[<debug info disabled>]");
            } else if (obj != d7f0.f46180n1) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public int m94760f() {
        int size;
        synchronized (f276794g) {
            size = ((List) this.f276797c).size();
        }
        return size;
    }

    /* JADX INFO: renamed from: g */
    public void m94761g(uvz0 uvz0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        syg1.m79688g("handleNewRequest " + uvz0Var);
        if (wia.m88198i().f251595k.f94953a && !uvz0Var.mo54193i()) {
            String str = "Requested operation cannot be completed since tracking is disabled [" + nap.m64012e(uvz0Var.f234528d) + "]";
            syg1.m79688g(str);
            uvz0Var.mo27350f(-117, str);
            return;
        }
        if (wia.m88198i().f251598n != 1 && !((z = uvz0Var instanceof vvz0)) && !((z2 = uvz0Var instanceof irt0)) && !((z3 = uvz0Var instanceof jrt0)) && !z && !z2 && !z3) {
            syg1.m79688g("handleNewRequest " + uvz0Var + " needs a session");
            uvz0Var.f234531g.add(tvz0.f224279a);
        }
        synchronized (f276794g) {
            try {
                syg1.m79703v("Queue operation enqueue. Request: " + uvz0Var);
                ((List) this.f276797c).add(uvz0Var);
                if (m94760f() >= 25) {
                    syg1.m79703v("Queue maxed out. Removing index 1.");
                    ((List) this.f276797c).remove(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        System.currentTimeMillis();
        m94766m("handleNewRequest");
    }

    /* JADX INFO: renamed from: i */
    public void m94762i(vvz0 vvz0Var, int i) {
        synchronized (f276794g) {
            try {
                try {
                    syg1.m79703v("Queue operation insert. Request: " + vvz0Var + " Size: " + ((List) this.f276797c).size() + " Index: " + i);
                    if (((List) this.f276797c).size() < i) {
                        i = ((List) this.f276797c).size();
                    }
                    ((List) this.f276797c).add(i, vvz0Var);
                } catch (IndexOutOfBoundsException e) {
                    syg1.m79689h("Caught IndexOutOfBoundsException " + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public uvz0 m94763j() {
        uvz0 uvz0Var;
        synchronized (f276794g) {
            try {
                uvz0Var = (uvz0) ((List) this.f276797c).get(0);
            } catch (IndexOutOfBoundsException | NoSuchElementException e) {
                syg1.m79704w("Caught Exception ServerRequestQueue peek: " + e.getMessage());
                uvz0Var = null;
            }
        }
        return uvz0Var;
    }

    /* JADX INFO: renamed from: k */
    public uvz0 m94764k(int i) {
        uvz0 uvz0Var;
        synchronized (f276794g) {
            uvz0 uvz0Var2 = null;
            try {
                uvz0Var = (uvz0) ((List) this.f276797c).get(i);
                try {
                    syg1.m79703v("Queue operation peekAt " + uvz0Var);
                } catch (IndexOutOfBoundsException | NoSuchElementException e) {
                    e = e;
                    uvz0Var2 = uvz0Var;
                    syg1.m79689h("Caught Exception ServerRequestQueue peekAt " + i + ": " + e.getMessage());
                    uvz0Var = uvz0Var2;
                }
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
            } catch (NoSuchElementException e3) {
                e = e3;
            }
        }
        return uvz0Var;
    }

    /* JADX INFO: renamed from: l */
    public void m94765l() {
        String string;
        if (pi9.m70079d(syg1.m79690i()) == pi9.m70079d(5)) {
            synchronized (f276794g) {
                try {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < ((List) this.f276797c).size(); i++) {
                        sb.append(((List) this.f276797c).get(i));
                        sb.append(" with locks ");
                        uvz0 uvz0Var = (uvz0) ((List) this.f276797c).get(i);
                        uvz0Var.getClass();
                        try {
                            string = Arrays.toString(uvz0Var.f234531g.toArray());
                        } catch (ConcurrentModificationException unused) {
                            syg1.m79704w("ConcurrentModificationException in printWaitLocks - queue modified during iteration.");
                            string = "[concurrent-modification]";
                        }
                        sb.append(string);
                        sb.append("\n");
                    }
                    syg1.m79703v("Queue is: " + ((Object) sb));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m94766m(String str) {
        Semaphore semaphore = (Semaphore) this.f276798d;
        syg1.m79703v("processNextQueueItem ".concat(str));
        m94765l();
        try {
            semaphore.acquire();
            if (this.f276796b != 0 || m94760f() <= 0) {
                semaphore.release();
                return;
            }
            this.f276796b = 1;
            uvz0 uvz0VarM94763j = m94763j();
            semaphore.release();
            if (uvz0VarM94763j == null) {
                m94767n(null);
                return;
            }
            syg1.m79688g("processNextQueueItem, req " + uvz0VarM94763j);
            if (uvz0VarM94763j.f234531g.size() > 0) {
                this.f276796b = 0;
                return;
            }
            if (!(uvz0VarM94763j instanceof zvz0) && !(uvz0VarM94763j instanceof irt0) && !(uvz0VarM94763j instanceof jrt0) && !m94755h()) {
                syg1.m79688g("Branch Error: User session has not been initialized!");
                this.f276796b = 0;
                syg1.m79703v("Invoking " + uvz0VarM94763j + " handleFailure. Has no session. hasUser: " + m94755h());
                StringBuilder sb = new StringBuilder("Request ");
                sb.append(uvz0VarM94763j);
                sb.append(" has no session.");
                uvz0VarM94763j.mo27350f(-101, sb.toString());
                return;
            }
            if ((((uvz0VarM94763j instanceof vvz0) || (uvz0VarM94763j instanceof irt0) || (uvz0VarM94763j instanceof jrt0)) ? false : true) && (wia.m88198i().f251586b.m87778I("bnc_session_id").equals("bnc_no_value") || wia.m88198i().f251586b.m87775F().equals("bnc_no_value"))) {
                this.f276796b = 0;
                syg1.m79703v("Invoking " + uvz0VarM94763j + " handleFailure. Has no session.");
                uvz0VarM94763j.mo27350f(-101, "Request " + uvz0VarM94763j + " has no session.");
                return;
            }
            SharedPreferences sharedPreferences = (SharedPreferences) wia.m88198i().f251586b.f250160a;
            m94758d(uvz0VarM94763j, sharedPreferences.getInt("bnc_connect_timeout", 10000) + sharedPreferences.getInt("bnc_timeout", 5500));
        } catch (Exception e) {
            StringBuilder sbM38572u = edb.m38572u("Caught Exception ", str, " processNextQueueItem: ");
            sbM38572u.append(e.getMessage());
            sbM38572u.append(" stacktrace: ");
            sbM38572u.append(syg1.m79699r(e));
            syg1.m79689h(sbM38572u.toString());
        }
    }

    /* JADX INFO: renamed from: n */
    public void m94767n(uvz0 uvz0Var) {
        synchronized (f276794g) {
            try {
                try {
                    syg1.m79703v("Queue operation remove. Request: " + uvz0Var);
                    syg1.m79703v("Queue operation remove. Removed: " + (((List) this.f276797c).remove(uvz0Var) || !((List) this.f276797c).contains(uvz0Var)));
                } catch (UnsupportedOperationException e) {
                    syg1.m79689h("Caught UnsupportedOperationException " + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int[], java.io.Serializable] */
    /* JADX INFO: renamed from: o */
    public void m94768o() {
        int i = this.f276796b * 2;
        this.f276798d = Arrays.copyOf((Object[]) this.f276798d, i);
        ?? r1 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            r1[i2] = -1;
        }
        bk5.m29635t0(0, 0, 14, (int[]) this.f276799e, r1);
        this.f276799e = r1;
    }

    /* JADX INFO: renamed from: p */
    public void m94769p(tvz0 tvz0Var) {
        synchronized (f276794g) {
            try {
                for (uvz0 uvz0Var : (List) this.f276797c) {
                    if (uvz0Var != null) {
                        uvz0Var.f234531g.remove(tvz0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m94770q() {
        JSONObject jSONObject;
        for (int i = 0; i < m94760f(); i++) {
            try {
                uvz0 uvz0VarM94764k = m94764k(i);
                syg1.m79703v("Queue operation updateAllRequestsInQueue updating: " + uvz0VarM94764k);
                if (uvz0VarM94764k != null && (jSONObject = uvz0VarM94764k.f234527c) != null) {
                    okq okqVar = okq.RandomizedBundleToken;
                    if (jSONObject.has("session_id")) {
                        uvz0VarM94764k.f234527c.put("session_id", wia.m88198i().f251586b.m87778I("bnc_session_id"));
                    }
                    if (jSONObject.has("randomized_bundle_token")) {
                        uvz0VarM94764k.f234527c.put("randomized_bundle_token", wia.m88198i().f251586b.m87774E());
                    }
                    if (jSONObject.has("randomized_device_token")) {
                        uvz0VarM94764k.f234527c.put("randomized_device_token", wia.m88198i().f251586b.m87775F());
                    }
                }
            } catch (JSONException e) {
                syg1.m79689h("Caught JSONException " + e.getMessage());
                return;
            }
        }
    }

    public String toString() {
        switch (this.f276795a) {
            case 1:
                return m94759e();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.io.Serializable] */
    public yvz0(qk60 qk60Var) {
        this.f276795a = 1;
        this.f276797c = qk60Var;
        this.f276798d = new Object[8];
        ?? r0 = new int[8];
        for (int i = 0; i < 8; i++) {
            r0[i] = -1;
        }
        this.f276799e = r0;
        this.f276796b = -1;
    }

    public yvz0(Context context) {
        this.f276795a = 0;
        this.f276798d = new Semaphore(1);
        this.f276796b = 0;
        this.f276799e = new ConcurrentHashMap();
        syg1.m79703v("Creating ServerRequestQueue " + context);
        context.getSharedPreferences("BNC_Server_Request_Queue", 0).edit();
        List listSynchronizedList = Collections.synchronizedList(new LinkedList());
        this.f276797c = listSynchronizedList;
        syg1.m79703v("Created queue " + listSynchronizedList);
    }
}
