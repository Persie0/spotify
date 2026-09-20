package androidx.p004xr.runtime.interfaces;

import kotlin.Metadata;
import p204p.bvr;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\t"}, m24212d2 = {"Landroidx/xr/runtime/interfaces/DisplayBlendMode;", "", "", "value", "<init>", "(I)V", "I", "Companion", "p/bvr", "runtime-interfaces"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class DisplayBlendMode {
    private final int value;
    public static final bvr Companion = new bvr();
    private static final DisplayBlendMode NO_DISPLAY = new DisplayBlendMode(0);
    private static final DisplayBlendMode ADDITIVE = new DisplayBlendMode(1);
    private static final DisplayBlendMode ALPHA_BLEND = new DisplayBlendMode(2);

    private DisplayBlendMode(int i) {
        this.value = i;
    }
}
