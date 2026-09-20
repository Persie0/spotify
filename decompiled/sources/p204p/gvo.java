package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gvo {

    /* JADX INFO: renamed from: a */
    public final kv91 f84791a;

    /* JADX INFO: renamed from: b */
    public final zb70 f84792b;

    public gvo(kv91 kv91Var, zb70 zb70Var) {
        this.f84791a = kv91Var;
        this.f84792b = zb70Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m45900a() {
        zm8 zm8Var = (zm8) this.f84792b.f281273b;
        zm8Var.getClass();
        yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("snackbar", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = zt91VarM94607a;
        nu91Var.f248108b = zm8Var.f284179b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        this.f84791a.mo57449i((ou91) nu91Var.m87248a(), null);
    }
}
