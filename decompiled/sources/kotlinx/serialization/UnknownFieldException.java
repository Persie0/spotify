package kotlinx.serialization;

import kotlin.Metadata;
import p204p.s571;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lkotlinx/serialization/UnknownFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i) {
        super(s571.m77246e(i, "An unknown field for index "));
    }
}
