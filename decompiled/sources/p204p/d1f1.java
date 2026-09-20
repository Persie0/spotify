package p204p;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d1f1 {

    /* JADX INFO: renamed from: a */
    public final c3f1 f44255a;

    /* JADX INFO: renamed from: b */
    public final String f44256b;

    /* JADX INFO: renamed from: c */
    public final ev61 f44257c;

    /* JADX INFO: renamed from: d */
    public final t5m0 f44258d;

    /* JADX INFO: renamed from: e */
    public final f0f1 f44259e;

    public d1f1(Context context, c3f1 c3f1Var, t5m0 t5m0Var) {
        ev61 ev61Var = new ev61();
        this.f44257c = ev61Var;
        this.f44256b = context.getPackageName();
        this.f44255a = c3f1Var;
        this.f44258d = t5m0Var;
        f0f1 f0f1Var = new f0f1(context, c3f1Var, e1f1.f55197a, new ajp0());
        this.f44259e = f0f1Var;
        f0f1Var.m40478a().post(new d0f1(this, ev61Var, context));
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m34631a(d1f1 d1f1Var, s2f1 s2f1Var, long j, long j2) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", d1f1Var.f44256b);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", s2f1Var.f205001a);
        bundle.putLong("warm.up.sid", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(s2f1Var.f205002b));
        ArrayList arrayList = new ArrayList();
        jkc0.m53600l(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(jkc0.m53598j(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ Bundle m34632b(d1f1 d1f1Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", d1f1Var.f44256b);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        jkc0.m53600l(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(jkc0.m53598j(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m34633c(d1f1 d1f1Var) {
        return d1f1Var.f44257c.f63172a.mo1518j() && ((Integer) d1f1Var.f44257c.f63172a.mo1515g()).intValue() < 83420000;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m34634d(d1f1 d1f1Var) {
        return d1f1Var.f44257c.f63172a.mo1518j() && ((Integer) d1f1Var.f44257c.f63172a.mo1515g()).intValue() == 0;
    }
}
