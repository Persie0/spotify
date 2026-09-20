package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class crf1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f41290a = 0;

    static {
        int i = frf1.f72475K0;
    }

    /* JADX INFO: renamed from: a */
    public static String m33737a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i = mmf1.f145137a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable unused) {
            mmf1.m62315i("BillingLogger");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static leg1 m33738b(int i, int i2, ye9 ye9Var, String str, hgg1 hgg1Var) {
        try {
            hfg1 hfg1VarM80671q = tfg1.m80671q();
            int i3 = ye9Var.f271939a;
            hfg1VarM80671q.m43489d();
            tfg1.m80670p((tfg1) hfg1VarM80671q.f76214b, i3);
            String str2 = ye9Var.f271941c;
            hfg1VarM80671q.m43489d();
            tfg1.m80673s((tfg1) hfg1VarM80671q.f76214b, str2);
            int i4 = ye9Var.f271940b;
            if (i4 != 0) {
                hfg1VarM80671q.m43489d();
                tfg1.m80675u((tfg1) hfg1VarM80671q.f76214b, i4);
            }
            if (i != 0) {
                hfg1VarM80671q.m47340e(i);
            }
            if (str != null) {
                hfg1VarM80671q.m43489d();
                tfg1.m80672r((tfg1) hfg1VarM80671q.f76214b, str);
            }
            eeg1 eeg1VarM58784s = leg1.m58784s();
            eeg1VarM58784s.m38658e(hfg1VarM80671q);
            eeg1VarM58784s.m38660h(i2);
            if (!hgg1Var.equals(hgg1.BROADCAST_ACTION_UNSPECIFIED)) {
                eeg1VarM58784s.m43489d();
                leg1.m58786v((leg1) eeg1VarM58784s.f76214b, hgg1Var);
            }
            return (leg1) eeg1VarM58784s.m43487b();
        } catch (Throwable unused) {
            mmf1.m62315i("BillingLogger");
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static dfg1 m33739c(int i, hgg1 hgg1Var) {
        try {
            oeg1 oeg1VarM35888q = dfg1.m35888q();
            oeg1VarM35888q.m43489d();
            dfg1.m35887p((dfg1) oeg1VarM35888q.f76214b, i);
            if (!hgg1Var.equals(hgg1.BROADCAST_ACTION_UNSPECIFIED)) {
                oeg1VarM35888q.m43489d();
                dfg1.m35889s((dfg1) oeg1VarM35888q.f76214b, hgg1Var);
            }
            return (dfg1) oeg1VarM35888q.m43487b();
        } catch (Exception unused) {
            mmf1.m62315i("BillingLogger");
            return null;
        }
    }
}
