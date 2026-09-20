package p204p;

import androidx.car.app.model.Alert;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class m80 {

    /* JADX INFO: renamed from: a */
    public final HashSet f140878a;

    /* JADX INFO: renamed from: b */
    public final HashSet f140879b;

    /* JADX INFO: renamed from: c */
    public final HashSet f140880c;

    /* JADX INFO: renamed from: d */
    public int f140881d;

    /* JADX INFO: renamed from: e */
    public int f140882e;

    /* JADX INFO: renamed from: f */
    public int f140883f;

    /* JADX INFO: renamed from: g */
    public boolean f140884g;

    /* JADX INFO: renamed from: h */
    public boolean f140885h;

    /* JADX INFO: renamed from: i */
    public boolean f140886i;

    /* JADX INFO: renamed from: j */
    public boolean f140887j;

    /* JADX INFO: renamed from: k */
    public uzb f140888k;

    public m80() {
        this.f140878a = new HashSet();
        this.f140879b = new HashSet();
        this.f140880c = new HashSet();
        this.f140881d = Alert.DURATION_SHOW_INDEFINITELY;
        this.f140882e = 0;
        this.f140887j = false;
        this.f140888k = uzb.f235455c;
    }

    /* JADX INFO: renamed from: a */
    public final void m61096a(int i) {
        this.f140880c.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b */
    public final void m61097b() {
        new n80(this);
    }

    public m80(n80 n80Var) {
        HashSet hashSet = new HashSet();
        this.f140878a = hashSet;
        HashSet hashSet2 = new HashSet();
        this.f140879b = hashSet2;
        HashSet hashSet3 = new HashSet();
        this.f140880c = hashSet3;
        this.f140881d = Alert.DURATION_SHOW_INDEFINITELY;
        this.f140882e = 0;
        this.f140887j = false;
        uzb uzbVar = uzb.f235454b;
        this.f140881d = n80Var.f151283a;
        this.f140882e = n80Var.f151284b;
        this.f140883f = n80Var.f151285c;
        this.f140888k = n80Var.f151290h;
        hashSet.addAll(n80Var.f151291i);
        hashSet2.addAll(n80Var.f151292j);
        hashSet3.addAll(n80Var.f151293k);
        this.f140884g = n80Var.f151286d;
        this.f140885h = n80Var.f151287e;
        this.f140886i = n80Var.f151288f;
        this.f140887j = n80Var.f151289g;
    }
}
