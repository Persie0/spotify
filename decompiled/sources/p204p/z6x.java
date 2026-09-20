package p204p;

import com.spotify.eventsender.eventsender.EventSenderDatabase_Impl;

/* JADX INFO: loaded from: classes6.dex */
public final class z6x extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f280013a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EventSenderDatabase_Impl f280014b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6x(EventSenderDatabase_Impl eventSenderDatabase_Impl, int i) {
        super(0);
        this.f280013a = i;
        this.f280014b = eventSenderDatabase_Impl;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f280013a) {
            case 0:
                return new l8x(this.f280014b);
            case 1:
                return new u8x(this.f280014b);
            default:
                return new m6u0(this.f280014b);
        }
    }
}
