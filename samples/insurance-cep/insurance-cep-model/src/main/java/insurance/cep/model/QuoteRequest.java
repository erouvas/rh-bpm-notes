package insurance.cep.model;

import java.util.Date;
import java.util.UUID;

import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;
import org.kie.api.definition.type.Role.Type;
import org.kie.api.definition.type.Timestamp;

import com.redhat.ssa.util.AbstractFact;
import com.redhat.ssa.util.Event;

@Role(Type.EVENT)
@Timestamp("timestamp")
@Expires("5d")
public class QuoteRequest extends AbstractFact implements Event {

	private static final long serialVersionUID = 1L;
	private String plateId;
	private double value;
	private Date timestamp;

	public QuoteRequest(String plateId, double value, long time) {
		this(UUID.randomUUID().toString(), plateId, value, new Date(time));
	}

	public QuoteRequest(String plateId, double value, Date timestamp) {
		this(UUID.randomUUID().toString(), plateId, value, timestamp);
	}

	public QuoteRequest(String id, String plateId, double value, Date timestamp) {
		super(id);
		this.plateId = plateId;
		this.value = value;
		this.timestamp = timestamp;
	}

	public String getPlateId() {
		return plateId;
	}

	public void setPlateId(String plateId) {
		this.plateId = plateId;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date eventTimestamp) {
		this.timestamp = eventTimestamp;
	}
}
