package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w0g1 extends kv30 implements l1g1 {
    public w0g1() {
        super("com.google.android.gms.wearable.internal.IWearableListener", 10);
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: b2 */
    public final boolean mo25223b2(int i, Parcel parcel, Parcel parcel2) {
        c0g1 c0g1Var;
        if (i == 13) {
            e4g1 e4g1Var = (e4g1) qmf1.m73271a(parcel, e4g1.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c0g1Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                c0g1Var = iInterfaceQueryLocalInterface instanceof c0g1 ? (c0g1) iInterfaceQueryLocalInterface : new c0g1(strongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 5);
            }
            qmf1.m73272b(parcel);
            mo28929i1(e4g1Var, c0g1Var);
            return true;
        }
        if (i == 14) {
            qmf1.m73272b(parcel);
            return true;
        }
        switch (i) {
            case 1:
                DataHolder dataHolder = (DataHolder) qmf1.m73271a(parcel, DataHolder.CREATOR);
                qmf1.m73272b(parcel);
                mo28931q0(dataHolder);
                return true;
            case 2:
                e4g1 e4g1Var2 = (e4g1) qmf1.m73271a(parcel, e4g1.CREATOR);
                qmf1.m73272b(parcel);
                mo28930n0(e4g1Var2);
                return true;
            case 3:
                j6g1 j6g1Var = (j6g1) qmf1.m73271a(parcel, j6g1.CREATOR);
                qmf1.m73272b(parcel);
                mo28924N1(j6g1Var);
                return true;
            case 4:
                j6g1 j6g1Var2 = (j6g1) qmf1.m73271a(parcel, j6g1.CREATOR);
                qmf1.m73272b(parcel);
                mo28923H1(j6g1Var2);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(j6g1.CREATOR);
                qmf1.m73272b(parcel);
                mo28925Q(arrayListCreateTypedArrayList);
                return true;
            case 6:
                zkg1 zkg1Var = (zkg1) qmf1.m73271a(parcel, zkg1.CREATOR);
                qmf1.m73272b(parcel);
                mo28927U1(zkg1Var);
                return true;
            case 7:
                qjf1 qjf1Var = (qjf1) qmf1.m73271a(parcel, qjf1.CREATOR);
                qmf1.m73272b(parcel);
                mo28922D0(qjf1Var);
                return true;
            case 8:
                sgf1 sgf1Var = (sgf1) qmf1.m73271a(parcel, sgf1.CREATOR);
                qmf1.m73272b(parcel);
                mo28926R0(sgf1Var);
                return true;
            case 9:
                lbg1 lbg1Var = (lbg1) qmf1.m73271a(parcel, lbg1.CREATOR);
                qmf1.m73272b(parcel);
                mo28932s0(lbg1Var);
                return true;
            default:
                return false;
        }
    }
}
