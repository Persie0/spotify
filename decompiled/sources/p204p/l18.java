package p204p;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class l18 {

    /* JADX INFO: renamed from: a */
    public final long f128649a;

    public l18(long j) {
        this.f128649a = j;
    }

    /* JADX INFO: renamed from: a */
    public static l18 m57865a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        l18 l18Var = new l18(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return l18Var;
                    }
                    l18 l18Var2 = new l18(jsonReader.nextLong());
                    jsonReader.close();
                    return l18Var2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof l18) && this.f128649a == ((l18) obj).f128649a;
    }

    public final int hashCode() {
        long j = this.f128649a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return ikc0.m50938j(this.f128649a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
