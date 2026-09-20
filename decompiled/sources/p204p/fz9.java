package p204p;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class fz9 implements InterfaceC2129mj, obj0, nz9 {

    /* JADX INFO: renamed from: a */
    public final sx3 f74943a;

    /* JADX INFO: renamed from: b */
    public final cej0 f74944b;

    /* JADX INFO: renamed from: c */
    public final Observable f74945c;

    /* JADX INFO: renamed from: d */
    public final luk f74946d;

    /* JADX INFO: renamed from: e */
    public final zv41 f74947e;

    /* JADX INFO: renamed from: f */
    public final zv41 f74948f;

    /* JADX INFO: renamed from: g */
    public xuk f74949g;

    public fz9(sx3 sx3Var, cej0 cej0Var, Observable observable, luk lukVar) {
        this.f74943a = sx3Var;
        this.f74944b = cej0Var;
        this.f74945c = observable;
        this.f74946d = lukVar;
        zv41 zv41VarM52819d = jag1.m52819d(lau.f131415a);
        this.f74947e = zv41VarM52819d;
        this.f74948f = zv41VarM52819d;
        this.f74949g = dq60.m36621u(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: f */
    public static final Object m43177f(fz9 fz9Var, ibk ibkVar) {
        bz9 bz9Var;
        zv41 zv41Var = fz9Var.f74947e;
        cej0 cej0Var = fz9Var.f74944b;
        sx3 sx3Var = fz9Var.f74943a;
        if (ibkVar instanceof bz9) {
            bz9Var = (bz9) ibkVar;
            int i = bz9Var.f32444c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bz9Var.f32444c = i - Integer.MIN_VALUE;
            } else {
                bz9Var = new bz9(fz9Var, ibkVar);
            }
        } else {
            bz9Var = new bz9(fz9Var, ibkVar);
        }
        Object objM79572a = bz9Var.f32442a;
        int i2 = bz9Var.f32444c;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM79572a);
                if (sx3Var.f214795a == null || !cej0Var.m32585a()) {
                    cej0Var.m32585a();
                    return w2a1Var;
                }
                bz9Var.f32444c = 1;
                objM79572a = sx3Var.m79572a(bz9Var);
                yuk yukVar = yuk.f276404a;
                if (objM79572a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM79572a);
            }
            Iterable iterable = (Iterable) objM79572a;
            ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(m43178g(((gz9) it.next()).m46193a()));
            }
            arrayList.toString();
            Objects.toString((List) zv41Var.getValue());
            Objects.toString(arrayList);
            zv41Var.getClass();
            zv41Var.m97091m(null, arrayList);
            return w2a1Var;
        } catch (Exception e) {
            Logger.m3967c(e, "Error fetching bluetooth devices", new Object[0]);
            return w2a1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: g */
    public static C1742ci m43178g(BluetoothDevice bluetoothDevice) {
        String name;
        String strValueOf;
        List listM44518y;
        String name2 = bluetoothDevice.getName();
        if (Build.VERSION.SDK_INT >= 30) {
            name = bluetoothDevice.getAlias();
            if (TextUtils.isEmpty(name)) {
                name = bluetoothDevice.getName();
            }
        } else {
            name = bluetoothDevice.getName();
        }
        String str = name;
        r040 r040Var = r040.f194380b;
        r040 r040VarM80042m = t46.m80042m(EnumC2166nj.f154402c, bluetoothDevice.getAddress());
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        if (bluetoothClass == null || (strValueOf = String.valueOf(bluetoothClass.getDeviceClass())) == null) {
            strValueOf = "1024";
        }
        String str2 = strValueOf;
        ParcelUuid[] uuids = bluetoothDevice.getUuids();
        if (uuids != null) {
            for (ParcelUuid parcelUuid : uuids) {
                UUID uuid = parcelUuid.getUuid();
                InterfaceC2415th.f220296a.getClass();
                if (wj50.m88271j(uuid, C2015jh.f112301b)) {
                    listM44518y = geg1.m44518y("spotify-tap");
                }
            }
            listM44518y = lau.f131415a;
        } else {
            listM44518y = lau.f131415a;
        }
        return new C1742ci(name2, str, str2, 3, listM44518y, null, null, r040VarM80042m, 96);
    }

    @Override // p204p.InterfaceC2129mj
    /* JADX INFO: renamed from: a */
    public final void mo32612a() {
        kk40.m56680v(this.f74949g, null);
    }

    @Override // p204p.InterfaceC2129mj
    /* JADX INFO: renamed from: b */
    public final void mo32613b() {
        xuk xukVarM37073v = dv9.m37073v(this.f74949g, new f30(this, 27));
        this.f74949g = xukVarM37073v;
        x0h1.m89578u(xukVarM37073v, null, 0, new C2069kx(this, null, 8), 3);
    }

    @Override // p204p.nz9
    /* JADX INFO: renamed from: c */
    public final void mo43179c(Context context, BluetoothDevice bluetoothDevice) {
        x0h1.m89578u(this.f74949g, null, 0, new cz9(this, bluetoothDevice, null, 0), 3);
    }

    @Override // p204p.InterfaceC2129mj
    /* JADX INFO: renamed from: d */
    public final fiz mo32614d() {
        return this.f74948f;
    }

    @Override // p204p.nz9
    /* JADX INFO: renamed from: e */
    public final void mo43180e(BluetoothDevice bluetoothDevice) {
        x0h1.m89578u(this.f74949g, null, 0, new cz9(this, bluetoothDevice, null, 1), 3);
    }

    /* JADX INFO: renamed from: h */
    public final void m43181h(udj0 udj0Var) {
        udj0Var.toString();
        if (udj0Var != udj0.f229262c) {
            xuk xukVarM37073v = dv9.m37073v(this.f74949g, new bj9(this, 9));
            this.f74949g = xukVarM37073v;
            x0h1.m89578u(xukVarM37073v, null, 0, new dz9(this, null, 0), 3);
        }
    }
}
