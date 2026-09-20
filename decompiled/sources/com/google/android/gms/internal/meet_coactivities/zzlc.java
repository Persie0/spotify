package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzlc extends zzlt {
    public zzlc(String str, Class cls, boolean z) {
        super("group_by", cls, true);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzlt
    public final void zza(Iterator it, zzls zzlsVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                zzlsVar.zza(zzf(), next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String strZzf = zzf();
            sb.append(']');
            zzlsVar.zza(strZzf, sb.toString());
        }
    }
}
