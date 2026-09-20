package p204p;

/* JADX INFO: loaded from: classes.dex */
public interface ug5 {
    /* JADX INFO: renamed from: a */
    Object mo67761a();

    /* JADX INFO: renamed from: b */
    void mo53943b(int i, int i2, int i3);

    void clear();

    /* JADX INFO: renamed from: f */
    void mo53944f(int i, int i2);

    /* JADX INFO: renamed from: g */
    default void mo67762g(Object obj, th00 th00Var) {
        th00Var.invoke(mo67761a(), obj);
    }

    /* JADX INFO: renamed from: i */
    void mo53945i(int i, Object obj);

    /* JADX INFO: renamed from: n */
    void mo53947n(int i, Object obj);

    /* JADX INFO: renamed from: o */
    void mo67763o(Object obj);

    /* JADX INFO: renamed from: p */
    default void mo57589p() {
        Object objMo67761a = mo67761a();
        glh glhVar = objMo67761a instanceof glh ? (glh) objMo67761a : null;
        if (glhVar != null) {
            glhVar.mo45178c();
        }
    }

    /* JADX INFO: renamed from: u */
    void mo67764u();

    /* JADX INFO: renamed from: j */
    default void mo53946j() {
    }
}
