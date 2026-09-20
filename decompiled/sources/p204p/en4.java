package p204p;

import androidx.car.app.model.Alert;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class en4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f61060a;

    /* JADX INFO: renamed from: b */
    public final bji f61061b;

    /* JADX INFO: renamed from: c */
    public final wg61 f61062c = new wg61(new cn4(this, 1));

    public en4(int i, bji bjiVar) {
        this.f61060a = i;
        this.f61061b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m39470a() {
        en4 en4Var = (en4) this.f61062c.getValue();
        return en4Var != null ? en4Var.m39470a() : this.f61060a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("update_version", "android-puffin-auto-updating", m39470a(), 0, Alert.DURATION_SHOW_INDEFINITELY));
    }
}
