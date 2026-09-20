package p204p;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class ye8 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f271932a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bf8 f271933b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ UUID f271934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye8(bf8 bf8Var, UUID uuid, int i) {
        super(1);
        this.f271932a = i;
        this.f271933b = bf8Var;
        this.f271934c = uuid;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f271932a) {
            case 0:
                BluetoothGattCharacteristic characteristic = ((BluetoothGattService) obj).getCharacteristic(this.f271934c);
                this.f271933b.getClass();
                return bf8.m29000d(characteristic, ke8.f121829a);
            default:
                BluetoothGattCharacteristic characteristic2 = ((BluetoothGattService) obj).getCharacteristic(this.f271934c);
                this.f271933b.getClass();
                return bf8.m29000d(characteristic2, ke8.f121829a);
        }
    }
}
