package p204p;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class o0a0 {

    /* JADX INFO: renamed from: h */
    public static final AtomicLong f160316h = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final long f160317a;

    /* JADX INFO: renamed from: b */
    public final sjo f160318b;

    /* JADX INFO: renamed from: c */
    public final Uri f160319c;

    /* JADX INFO: renamed from: d */
    public final Map f160320d;

    /* JADX INFO: renamed from: e */
    public final long f160321e;

    /* JADX INFO: renamed from: f */
    public final long f160322f;

    /* JADX INFO: renamed from: g */
    public final long f160323g;

    public o0a0(long j, sjo sjoVar, Uri uri, Map map, long j2, long j3, long j4) {
        this.f160317a = j;
        this.f160318b = sjoVar;
        this.f160319c = uri;
        this.f160320d = map;
        this.f160321e = j2;
        this.f160322f = j3;
        this.f160323g = j4;
    }

    /* JADX INFO: renamed from: a */
    public final n0a0 m66010a() {
        n0a0 n0a0Var = new n0a0();
        n0a0Var.f148952a = this.f160317a;
        n0a0Var.f148953b = this.f160318b;
        n0a0Var.f148955d = this.f160319c;
        n0a0Var.f148956e = this.f160320d;
        n0a0Var.f148954c = this.f160321e;
        n0a0Var.f148957f = this.f160322f;
        n0a0Var.f148958g = this.f160323g;
        return n0a0Var;
    }

    public o0a0(n0a0 n0a0Var) {
        this.f160317a = n0a0Var.f148952a;
        this.f160318b = n0a0Var.f148953b;
        this.f160319c = n0a0Var.f148955d;
        this.f160320d = n0a0Var.f148956e;
        this.f160321e = n0a0Var.f148954c;
        this.f160322f = n0a0Var.f148957f;
        this.f160323g = n0a0Var.f148958g;
    }
}
