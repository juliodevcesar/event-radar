
# Event Radar - Development Roadmap

This document outlines the next development steps for Event Radar.

The project currently has a working REST API with PostgreSQL persistence, supporting event creation, listing, and retrieval by ID.

## Phase 1 - Complete Event CRUD (4 hours)

- Implement PUT /eventos/{id}
- Implement DELETE /eventos/{id}
- Handle missing resources consistently
- Test update and delete operations

## Phase 2 - Validation and Error Handling (4 hours)

- Add validation rules to event fields
- Validate incoming request bodies
- Implement centralized exception handling
- Return consistent API error responses

## Phase 3 - Search and Filtering (6 hours)

- Filter events by city or location
- Search events by date range
- Add event categories
- Implement pagination and sorting

## Phase 4 - Automated Testing (6 hours)

- Write unit tests for the service layer
- Add controller tests
- Test invalid requests and error responses
- Add integration tests for database operations

## Phase 5 - Geolocation (6 hours)

- Add latitude and longitude to events
- Support searching events near a location
- Implement distance-based filtering
- Prepare the API for future map integration

## Phase 6 - Documentation and Improvements (6 hours)

- Add OpenAPI/Swagger documentation
- Improve database configuration
- Introduce database migrations
- Review project structure and error handling
- Update README with new functionality

## Estimated Development Time

| Phase | Estimated Hours |
|---|---:|
| Complete Event CRUD | 4 |
| Validation and Error Handling | 4 |
| Search and Filtering | 6 |
| Automated Testing | 6 |
| Geolocation | 6 |
| Documentation and Improvements | 6 |
| **Total** | **32 hours** |

## Long-Term Ideas

- Interactive map for event discovery
- User accounts and authentication
- Event favorites
- Integration with external event platforms
- Frontend application

These estimates may change as development progresses.
