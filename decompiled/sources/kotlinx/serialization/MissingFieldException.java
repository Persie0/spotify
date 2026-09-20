package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MissingFieldException extends SerializationException {

    /* JADX INFO: renamed from: a */
    public final List f10919a;

    /* JADX INFO: renamed from: b */
    public final String f10920b;

    public MissingFieldException(String str, MissingFieldException missingFieldException, List list, String str2) {
        super(str, missingFieldException);
        this.f10919a = list;
        this.f10920b = str2;
    }
}
