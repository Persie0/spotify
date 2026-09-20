package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum gsi implements uzv {
    ICON_3D("icon_3d"),
    /* JADX INFO: Fake field, exist only in values array */
    ICON_2D("icon_2d"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_ICON("no_icon");


    /* JADX INFO: renamed from: a */
    public final String f83975a;

    gsi(String str) {
        this.f83975a = str;
    }

    @Override // p204p.uzv
    public final String value() {
        return this.f83975a;
    }
}
