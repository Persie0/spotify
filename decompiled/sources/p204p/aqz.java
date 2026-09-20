package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class aqz {

    /* JADX INFO: renamed from: b */
    public static final aqz f18873b = new aqz();

    /* JADX INFO: renamed from: c */
    public static final aqz f18874c = new aqz();

    /* JADX INFO: renamed from: d */
    public static final aqz f18875d = new aqz();

    /* JADX INFO: renamed from: a */
    public final qqi0 f18876a = new qqi0(0, new cqz[16]);

    /* JADX INFO: renamed from: b */
    public static void m26907b(aqz aqzVar) {
        aqzVar.getClass();
        if (aqzVar == f18873b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (aqzVar == f18874c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        qqi0 qqi0Var = aqzVar.f18876a;
        int i = qqi0Var.f191610c;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = qqi0Var.f191608a;
        for (int i2 = 0; i2 < i; i2++) {
            exh0 exh0Var = (exh0) ((cqz) objArr[i2]);
            if (!exh0Var.f63770a.f63766L0) {
                mt40.m62791c("visitChildren called on an unattached node");
            }
            qqi0 qqi0Var2 = new qqi0(0, new exh0[16]);
            exh0 exh0Var2 = exh0Var.f63770a;
            exh0 exh0Var3 = exh0Var2.f63775f;
            if (exh0Var3 == null) {
                wjg1.m88329h(qqi0Var2, exh0Var2);
            } else {
                qqi0Var2.m73556b(exh0Var3);
            }
            while (true) {
                int i3 = qqi0Var2.f191610c;
                if (i3 == 0) {
                    break;
                }
                exh0 exh0VarM88331j = (exh0) qqi0Var2.m73565l(i3 - 1);
                if ((exh0VarM88331j.f63773d & 1024) == 0) {
                    wjg1.m88329h(qqi0Var2, exh0VarM88331j);
                } else {
                    while (exh0VarM88331j != null) {
                        if ((exh0VarM88331j.f63772c & 1024) != 0) {
                            qqi0 qqi0Var3 = null;
                            while (exh0VarM88331j != null) {
                                if (exh0VarM88331j instanceof pqz) {
                                    if (((pqz) exh0VarM88331j).m70697N1(7)) {
                                        break;
                                    }
                                } else if ((exh0VarM88331j.f63772c & 1024) != 0 && (exh0VarM88331j instanceof xlq)) {
                                    int i4 = 0;
                                    for (exh0 exh0Var4 = ((xlq) exh0VarM88331j).f263224N0; exh0Var4 != null; exh0Var4 = exh0Var4.f63775f) {
                                        if ((exh0Var4.f63772c & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                exh0VarM88331j = exh0Var4;
                                            } else {
                                                if (qqi0Var3 == null) {
                                                    qqi0Var3 = new qqi0(0, new exh0[16]);
                                                }
                                                if (exh0VarM88331j != null) {
                                                    qqi0Var3.m73556b(exh0VarM88331j);
                                                    exh0VarM88331j = null;
                                                }
                                                qqi0Var3.m73556b(exh0Var4);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                exh0VarM88331j = wjg1.m88331j(qqi0Var3);
                            }
                            break;
                        }
                        exh0VarM88331j = exh0VarM88331j.f63775f;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final qqi0 m26908a() {
        return this.f18876a;
    }
}
