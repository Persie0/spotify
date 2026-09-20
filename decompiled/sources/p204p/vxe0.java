package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum vxe0 implements h2t0 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* JADX INFO: renamed from: a */
    public final int f245726a;

    vxe0(int i) {
        this.f245726a = i;
    }

    @Override // p204p.h2t0
    public final int getNumber() {
        return this.f245726a;
    }
}
