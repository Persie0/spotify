package p204p;

/* JADX INFO: loaded from: classes2.dex */
public interface deu {
    /* JADX INFO: renamed from: J */
    void mo35813J();

    /* JADX INFO: renamed from: O */
    void mo35814O(short s);

    /* JADX INFO: renamed from: P */
    void mo35815P(boolean z);

    /* JADX INFO: renamed from: S */
    void mo35816S(float f);

    /* JADX INFO: renamed from: U */
    void mo35817U(char c);

    /* JADX INFO: renamed from: W */
    default void m35818W(rr60 rr60Var, Object obj) {
        if (rr60Var.getDescriptor().mo57365b()) {
            mo35825i(rr60Var, obj);
        } else if (obj == null) {
            mo35813J();
        } else {
            mo35825i(rr60Var, obj);
        }
    }

    /* JADX INFO: renamed from: a0 */
    void mo35819a0(int i);

    /* JADX INFO: renamed from: b */
    hrh mo35820b(ktz0 ktz0Var);

    /* JADX INFO: renamed from: c */
    i82 mo35821c();

    /* JADX INFO: renamed from: g0 */
    default hrh mo35822g0(ktz0 ktz0Var, int i) {
        return mo35820b(ktz0Var);
    }

    /* JADX INFO: renamed from: h */
    void mo35823h(double d);

    /* JADX INFO: renamed from: h0 */
    void mo35824h0(String str);

    /* JADX INFO: renamed from: i */
    default void mo35825i(rr60 rr60Var, Object obj) {
        rr60Var.serialize(this, obj);
    }

    /* JADX INFO: renamed from: j */
    void mo35826j(byte b);

    /* JADX INFO: renamed from: r */
    void mo35827r(ktz0 ktz0Var, int i);

    /* JADX INFO: renamed from: v */
    deu mo35828v(ktz0 ktz0Var);

    /* JADX INFO: renamed from: z */
    void mo35829z(long j);
}
