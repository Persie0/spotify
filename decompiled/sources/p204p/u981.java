package p204p;

import android.content.Context;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class u981 {

    /* JADX INFO: renamed from: i */
    public static final long f228094i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f228095j = 0;

    /* JADX INFO: renamed from: a */
    public final Context f228096a;

    /* JADX INFO: renamed from: b */
    public final i6f0 f228097b;

    /* JADX INFO: renamed from: c */
    public final sdo f228098c;

    /* JADX INFO: renamed from: d */
    public final FirebaseMessaging f228099d;

    /* JADX INFO: renamed from: f */
    public final ScheduledThreadPoolExecutor f228101f;

    /* JADX INFO: renamed from: h */
    public final s981 f228103h;

    /* JADX INFO: renamed from: e */
    public final uj5 f228100e = new uj5(0);

    /* JADX INFO: renamed from: g */
    public boolean f228102g = false;

    public u981(FirebaseMessaging firebaseMessaging, i6f0 i6f0Var, s981 s981Var, sdo sdoVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f228099d = firebaseMessaging;
        this.f228097b = i6f0Var;
        this.f228103h = s981Var;
        this.f228098c = sdoVar;
        this.f228096a = context;
        this.f228101f = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public static void m82598a(y7h1 y7h1Var) throws IOException {
        try {
            bga.m29087i(y7h1Var, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m82599b(boolean z) {
        this.f228102g = z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f A[Catch: IOException -> 0x0044, TRY_LEAVE, TryCatch #2 {IOException -> 0x0044, blocks: (B:12:0x001a, B:25:0x005f, B:17:0x002b, B:19:0x0033, B:22:0x0046, B:24:0x004e), top: B:69:0x001a }] */
    /* JADX INFO: renamed from: c */
    public final boolean m82600c() throws IOException {
        q981 q981VarM77569a;
        while (true) {
            synchronized (this) {
                try {
                    q981VarM77569a = this.f228103h.m77569a();
                    if (q981VarM77569a == null) {
                        Log.isLoggable("FirebaseMessaging", 3);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            FirebaseMessaging firebaseMessaging = this.f228099d;
            sdo sdoVar = this.f228098c;
            try {
                String str = q981VarM77569a.f186541b;
                String str2 = q981VarM77569a.f186540a;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        m82598a(sdoVar.m77856E(firebaseMessaging.m1894a(), str2));
                        Log.isLoggable("FirebaseMessaging", 3);
                    } else {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else if (str.equals("S")) {
                    m82598a(sdoVar.m77855B(firebaseMessaging.m1894a(), str2));
                    Log.isLoggable("FirebaseMessaging", 3);
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
                s981 s981Var = this.f228103h;
                synchronized (s981Var) {
                    s981Var.f206886a.m51407v(q981VarM77569a.f186542c);
                }
                synchronized (this.f228100e) {
                    try {
                        String str3 = q981VarM77569a.f186542c;
                        if (this.f228100e.containsKey(str3)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.f228100e.get(str3);
                            ev61 ev61Var = (ev61) arrayDeque.poll();
                            if (ev61Var != null) {
                                ev61Var.m40097b(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.f228100e.remove(str3);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IOException e) {
                if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                    e.getMessage();
                    return false;
                }
                if (e.getMessage() == null) {
                    return false;
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m82601d(long j) {
        this.f228101f.schedule(new w981(this, this.f228096a, this.f228097b, Math.min(Math.max(30L, 2 * j), f228094i)), j, TimeUnit.SECONDS);
        m82599b(true);
    }
}
