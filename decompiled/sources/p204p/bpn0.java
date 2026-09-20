package p204p;

import android.content.Context;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes.dex */
public final class bpn0 implements Function, yns {

    /* JADX INFO: renamed from: b */
    public static final bpn0 f29548b = new bpn0(0);

    /* JADX INFO: renamed from: c */
    public static final bpn0 f29549c = new bpn0(1);

    /* JADX INFO: renamed from: d */
    public static final bpn0 f29550d = new bpn0(2);

    /* JADX INFO: renamed from: e */
    public static final bpn0 f29551e = new bpn0(3);

    /* JADX INFO: renamed from: f */
    public static final bpn0 f29552f = new bpn0(4);

    /* JADX INFO: renamed from: a */
    public int f29553a;

    public /* synthetic */ bpn0(int i) {
        this.f29553a = i;
    }

    @Override // p204p.yns
    /* JADX INFO: renamed from: a */
    public int mo30163a(Context context, String str, boolean z) {
        return 0;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return h8p0.m46839g(((Long) obj).longValue() + ((long) this.f29553a));
    }

    @Override // p204p.yns
    /* JADX INFO: renamed from: b */
    public int mo30164b(Context context, String str) {
        return this.f29553a;
    }
}
