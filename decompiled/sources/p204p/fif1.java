package p204p;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.ModuleUnavailableException;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class fif1 {

    /* JADX INFO: renamed from: a */
    public static final ura0 f69885a = new ura0("CastDynamiteModule", null);

    /* JADX INFO: renamed from: a */
    public static lbf1 m41717a(Context context, ebc ebcVar, wlf1 wlf1Var, HashMap map) throws ModuleUnavailableException {
        lbf1 z9f1Var;
        ajf1 ajf1VarM41718b = m41718b(context);
        imk0 imk0Var = new imk0(context.getApplicationContext());
        Parcel parcelM43604d2 = ajf1VarM41718b.m43604d2();
        fmf1.m42108c(parcelM43604d2, imk0Var);
        fmf1.m42107b(parcelM43604d2, ebcVar);
        fmf1.m42108c(parcelM43604d2, wlf1Var);
        parcelM43604d2.writeMap(map);
        Parcel parcelM43605e2 = ajf1VarM41718b.m43605e2(1, parcelM43604d2);
        IBinder strongBinder = parcelM43605e2.readStrongBinder();
        int i = paf1.f175524l;
        if (strongBinder == null) {
            z9f1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            z9f1Var = iInterfaceQueryLocalInterface instanceof lbf1 ? (lbf1) iInterfaceQueryLocalInterface : new z9f1(strongBinder, "com.google.android.gms.cast.framework.ICastContext", 1);
        }
        parcelM43605e2.recycle();
        return z9f1Var;
    }

    /* JADX INFO: renamed from: b */
    public static ajf1 m41718b(Context context) throws ModuleUnavailableException {
        try {
            IBinder iBinderM26620b = aos.m26614c(context, aos.f17747b, "com.google.android.gms.cast.framework.dynamite").m26620b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (iBinderM26620b == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM26620b.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return iInterfaceQueryLocalInterface instanceof ajf1 ? (ajf1) iInterfaceQueryLocalInterface : new ajf1(iBinderM26620b, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 1);
        } catch (DynamiteModule$LoadingException e) {
            throw new ModuleUnavailableException(e);
        }
    }
}
