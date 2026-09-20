package p204p;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mv3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f147497a;

    /* JADX INFO: renamed from: b */
    public final boolean f147498b;

    /* JADX INFO: renamed from: c */
    public final int f147499c;

    /* JADX INFO: renamed from: d */
    public final lv3 f147500d;

    /* JADX INFO: renamed from: e */
    public final bji f147501e;

    /* JADX INFO: renamed from: f */
    public final wg61 f147502f = new wg61(new ju3(this, 19));

    public mv3(int i, boolean z, int i2, lv3 lv3Var, bji bjiVar) {
        this.f147497a = i;
        this.f147498b = z;
        this.f147499c = i2;
        this.f147500d = lv3Var;
        this.f147501e = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m62889a() {
        mv3 mv3Var = (mv3) this.f147502f.getValue();
        return mv3Var != null ? mv3Var.m62889a() : this.f147497a;
    }

    /* JADX INFO: renamed from: b */
    public final int m62890b() {
        mv3 mv3Var = (mv3) this.f147502f.getValue();
        return mv3Var != null ? mv3Var.m62890b() : this.f147499c;
    }

    /* JADX INFO: renamed from: c */
    public final lv3 m62891c() {
        lv3 lv3VarM62891c;
        mv3 mv3Var = (mv3) this.f147502f.getValue();
        return (mv3Var == null || (lv3VarM62891c = mv3Var.m62891c()) == null) ? this.f147500d : lv3VarM62891c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m62892d() {
        mv3 mv3Var = (mv3) this.f147502f.getValue();
        return mv3Var != null ? mv3Var.m62892d() : this.f147498b;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("intervening_time_in_hours", "android-audiobooks-onboarding-bottom-sheet", m62889a(), 0, Alert.DURATION_SHOW_INDEFINITELY);
        k8a k8aVar2 = new k8a("is_eligible", "android-audiobooks-onboarding-bottom-sheet", m62892d());
        k8a k8aVar3 = new k8a("presentation_cap", "android-audiobooks-onboarding-bottom-sheet", m62890b(), 1, Alert.DURATION_SHOW_INDEFINITELY);
        String str = m62891c().f137209a;
        lv3[] lv3VarArrValues = lv3.values();
        ArrayList arrayList = new ArrayList(lv3VarArrValues.length);
        for (lv3 lv3Var : lv3VarArrValues) {
            arrayList.add(lv3Var.f137209a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, new k8a("type", "android-audiobooks-onboarding-bottom-sheet", str, arrayList));
    }
}
