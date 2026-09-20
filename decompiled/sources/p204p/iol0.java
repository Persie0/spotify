package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class iol0 {

    /* JADX INFO: renamed from: c */
    public static final List f104244c;

    /* JADX INFO: renamed from: a */
    public final kc60 f104245a;

    /* JADX INFO: renamed from: b */
    public volatile v49 f104246b;

    static {
        scf0 scf0Var = new scf0("frame");
        acf0 acf0Var = acf0.Gauge;
        zbf0 zbf0Var = new zbf0("ui.stutter.frame_count", acf0Var, scf0Var);
        ucf0 ucf0Var = ucf0.f229029a;
        f104244c = h6f.m46715L(zbf0Var, new zbf0("ui.stutter.frame_duration", acf0Var, ucf0Var), new zbf0("ui.frame_count", acf0Var, new scf0("frame")), new zbf0("ui.frame_duration", acf0Var, ucf0Var));
    }

    public iol0(kc60 kc60Var) {
        tnk0 tnk0Var = tnk0.f221995a;
        this.f104245a = kc60Var;
    }
}
